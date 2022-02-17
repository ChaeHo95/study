// 배열에서 배열요소 꺼내기 - 구조분해(destructuring assignment)

// 할당연산자의 좌변에 대괄호([])를 사용하고 변수를 지정하면 해당 변수에 배열요소가 복사
let fruits = ['apple', 'banana', 'orange', 'lemon', 'watermelon']
let [firstFruit] = fruits
console.log(firstFruit)

// 콤마(,)는 fruits 배열에서 콤마가 위치한 배열요소는 건너뛴다는 의미
fruits = ['apple', 'banana', 'orange', 'lemon', 'watermelon']
let [,,thirdFruit] = fruits
console.log(thirdFruit)

//배열의 마지막 요소만 추출하고 싶다면 reverse 메서드로 배열원소의 순서를 뒤바꾼 다음 구조분해를 이용
fruits = ['apple', 'banana', 'orange', 'lemon', 'watermelon']
const [lastFruit] = fruits.reverse()
console.log(lastFruit)

//스프레드 연산자(...)를 사용하면 첫번째 배열요소를 제외한 나머지 요소들로 이루어진 부분배열을 추출
fruits = ['apple', 'banana', 'orange', 'lemon', 'watermelon']
const [firstFruit, ...rest] = fruits
console.log(rest)
