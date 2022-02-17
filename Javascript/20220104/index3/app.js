// 배열요소 추가, 변경, 삭제 - splice 
// [배열].splice(변경 시작 인덱스, 삭제할 요소의 수, 추가할 요소 1, 추가할 요소2, ...)
// 배열의 splice 메서드는 배열에 요소를 추가하거나, 변경하거나 삭제하는 등의 모든 기능을 다 수행할 수 있는 만능 메서드

// banana 를 추가 
// splice 메서드의 두번째 인자에 0 을 설정하면 요소를 추가만 함.
//  제거된 요소가 없으므로 removedFruits 는 빈 배열을 출력


let fruits = ['apple', 'orange', 'watermelon']

let removedFruits = fruits.splice(1, 0, 'banana')

console.log(fruits)
console.log(removedFruits)

fruits = ['apple', 'orange', 'watermelon']

removedFruits = fruits.splice(1, 0, 'banana', 'strawberry')

console.log(fruits)
console.log(removedFruits)

// splice 메서드를 이용하여 fruits 배열의 2번 인덱스에서 1개의 요소를 제거

fruits = ['apple', 'banana', 'strawberry', 'orange', 'watermelon']

removedFruits = fruits.splice(2, 1)

console.log(fruits)
console.log(removedFruits)

// splice 메서드를 이용하여 fruits 배열의 0번 인덱스에서 3개의 요소를 제거,
// pear 와 lemon 이 각각 배열의 0번과 1번 인덱스로 추가

fruits = ['apple', 'banana', 'strawberry', 'orange', 'watermelon']

removedFruits = fruits.splice(0, 3, 'pear', 'lemon')

console.log(fruits)
console.log(removedFruits)

// banana, strawberry 2개 제거
// fruits.length - 4 는 1번 인덱스를 의미

fruits = ['apple', 'banana', 'strawberry', 'orange', 'watermelon']
removedFruits = fruits.splice(fruits.length - 4, 2)

console.log(fruits)
console.log(removedFruits)

// splice 메서드를 이용하여 fruits 배열의 3번 인덱스에서 1개의 요소를 제거
// orange 1개가 제거, 3번 인덱스에는 lemon 이 추가
// 배열요소 3번인 orange 가 lemon 으로 변경

fruits = ['apple', 'banana', 'strawberry', 'orange', 'watermelon']
removedFruits = fruits.splice(3, 1, 'lemon')

console.log(fruits)
console.log(removedFruits)