// 배열 검색  
//- indexOf, lastIndexOf, find, findIndex, includes, filter, some, every

//animals 라는 배열에서 'cat' 이라는 배열요소를 검색 
// 'cat' 은 현재 animals 배열에서 두군데 존재하지만 첫번째에 위치한 값만 반환
let animals = ['lion', 'tiger', 'cat', 'dog', 'pig', 'cat']

let searchedAnimal = animals.indexOf('cat')

console.log(searchedAnimal)

//  만약 두번째 'cat' 을 찾으려면 검색위치의 값를 추가

searchedAnimal = animals.indexOf('cat', 3)

console.log(searchedAnimal)

// 'giraffe' 라는 동물은 animals 배열에 존재하지 않으므로 -1 을 반환

searchedAnimal = animals.indexOf('giraffe')

console.log(searchedAnimal)

// cat 이라는 동물을 모두 검색
animals = ['lion', 'tiger', 'cat', 'dog', 'pig', 'cat', 'giraffe', 'duck', 'cat']
const animalToSearch = 'cat'
const searchedIndexes = []

let foundIndex = animals.indexOf(animalToSearch)
while (foundIndex != -1) {
    searchedIndexes.push(foundIndex)
    foundIndex = animals.indexOf(animalToSearch, foundIndex + 1)
}

console.log(searchedIndexes)

// [배열].lastIndexOf(검색할 요소, 검색 시작 위치)
// 배열의 lastIndexOf 메서드는 첫번째 인자로 검색할 배열요소가 들어감
// 배열의 끝에서부터 검색

animals = ['lion', 'tiger', 'cat', 'dog', 'pig', 'cat']

searchedAnimal = animals.lastIndexOf('cat')

console.log(searchedAnimal)

// 배열의 끝에서부터 검색하기 때문에, 
// 첫번째 'cat' 을 찾으려면 검색위치를 추가

animals = ['lion', 'tiger', 'cat', 'dog', 'pig', 'cat']

searchedAnimal = animals.lastIndexOf('cat', 3)

console.log(searchedAnimal)

// [배열].find(판별함수)
// [배열].findIndex(판별함수)

// 배열의 find 메서드는 인자로 판별함수가 들어가고
// 판별함수는 콜백함수로써 반복문에서 배열요소를 
// 조회하듯 각각의 배열요소를 꺼내서 판별조건을 만족하는지 검사


// // 판별함수
// function 판별함수이름(배열요소, 인덱스, 배열){
// 	return 판별조건
// }

const fruits = ['apple', 'banana', 'orange', 'watermelon']

function longest(element){
    return element.length > 6
}
const found = fruits.find(longest)
// const found = fruits.findIndex(longest)

console.log(found)

// [배열].includes(검색할 값)
// 배열의 includes 메서드는 배열이 인자로 주어진 값을 배열요소로 
// 가지고 있는지 판단

const seasons = ['spring', 'summer', 'autumn', 'winter']

console.log(seasons.includes('summer')) // true
console.log(seasons.includes('cat')) // false

// [배열].filter(판별함수)

// 배열의 filter 메서드는 인자로 판별함수가 들어간다. 
// 판별함수는 콜백함수로써 반복문에서 배열요소를 조회하듯 
// 각각의 배열요소를 꺼내서 판별조건을 만족하는지 검사

const words = ['car', 'paper', 'mobile', 'computer', 'school', 'sun', 'house']

function isShort(word){
    return word.length < 5
}

const wordsFiltered = words.filter(isShort)

console.log(wordsFiltered)

// [배열].some(판별함수)
// 배열의 some 메서드는 인자로 판별함수가 들어간다. 
// 판별함수는 콜백함수로써 반복문에서 배열요소를 조회하듯 
// 각각의 배열요소를 꺼내서 판별조건을 만족하는지 검사

let numbers = [32, 6, 4, 13, 9, 57]

function isMultiplyByThree(element){
    return element % 3 === 0
}

console.log(numbers.some(isMultiplyByThree))

// [배열].every(판별함수)
// 배열의 every 메서드는 인자로 판별함수가 들어간다. 
// 판별함수는 콜백함수로써 반복문에서 배열요소를 조회하듯 
// 각각의 배열요소를 꺼내서 판별조건을 만족하는지 검사

console.log(numbers.every(isMultiplyByThree))

// 반복문(for 문)을 사용하지 않는 배열요소 조회 및 처리 
// - forEach, map

// [배열].forEach(배열요소 각각에 대해 실행할 콜백함수)
// 배열의 forEach 메서드는 배열요소 각각에 대하여 인자로 주어진 콜백함수를 실행. 
// 반환값은 undefined 

// 배열의 forEach 메서드를 사용해서 현재 시간을 보기 좋게 출력
// 데이터를 재가공
const currentTime = [3, 8, 23] // 시, 분, 초
const timeStr = []

function addZero(time){
    timeStr.push(`${time < 10 ? '0' + time : time}`)
}

currentTime.forEach(addZero)

console.log('********* CURRENT TIME *********')
console.log(timeStr.join(':'))
console.log('***********************************')

// forEach 메서드를 사용해서 사용자 ID 정보로부터 사용자 연락처를 만들어 출력
let userIDs = ['victoria', 'sun', 'johseb', 'syleemomo', 'hannah', 'shara', 'martin', 'gorgia', 'nana', 'dannel']

console.log('********* USER EMAIL LIST *********')
function addDotCom(userID){
    console.log(userID + '@gmail.com')
}

userIDs.forEach(addDotCom)
console.log('***********************************')

// [새로운 배열] = [배열].map(배열요소 각각에 대해 실행할 콜백함수)
// 배열의 map 메서드는 배열요소 각각에 대하여 인자로 주어진 콜백함수를 실행
// 실행한 결과로 변경된 배열요소들을 모아서 새로운 배열로 반환

// 배열의 map 메서드를 사용해서 원본배열인 numbers 로부터 3의 배수로 
// 이루어진 새로운 배열인 numbersRefined 를 반환

numbers = [1, 2, 3, 4, 5]

function multiplyByThree(n){
    return n * 3
}

const numbersRefined = numbers.map(multiplyByThree)
console.log(numbersRefined)

// 배열의 map 메서드를 사용해서 사용자 연락처(이메일)가 저장된 배열인 
// userEmails 로부터 사용자 ID 로 이루어진 새로운 배열인 userIDs 를 반환
// 즉, forEach 예제와 정반대로 데이터를 재가공
const userEmails = [
    'victoria@gmail.com',
    'sun@gmail.com',
    'johseb@gmail.com',
    'syleemomo@gmail.com',
    'hannah@gmail.com',
    'shara@gmail.com',
    'martin@gmail.com',
    'gorgia@gmail.com',
    'nana@gmail.com',
    'dannel@gmail.com'
]

function removeDotCom(userEmail){
    return userEmail.split('@')[0]
}

function displayUserID(userID){
    console.log(userID)
}

userIDs = userEmails.map(removeDotCom)

console.log('********* USER ID LIST *********')
userIDs.forEach(displayUserID)
console.log('********************************')
