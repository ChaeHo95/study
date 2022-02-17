// 배열 참조 CRUD (참조, 참조변경, 참조 삭제)

const movies = ['Harry Potter', 'Indiana Jhones', 'Jurassic Park', 'Iron man', 'Spider man']
const fruits = ['apple', 'banana', 'orange']

let movies_copied = movies
movies_copied = fruits

console.log(movies_copied)

// 배열의 참조를 삭제하려면 위와 같이 null 값을 할당
movies = null
console.log(movies)

// 배열 복사
const movies_copied = movies
console.log(movies_copied)

//원본 배열에서 특정 배열요소가 변경되더라도 복사한 배열도 동일한 값을 가짐

movies[2] = null

console.log(movies)
console.log(movies_copied)

// 자바스크립트 최신문법에서는 스프레드 연산자(...)을 사용하여 원본 배열을 복사
// 새로운 배열이 생성되기 때문에 원본배열과 복사한 배열의 주소값은 다름

const movies = ['Harry Potter', 'Indiana Jhones', 'Jurassic Park', 'Iron man', 'Spider man']

const movies_copied = [...movies]

console.log(movies_copied)

// 원본 배열의 특정 배열요소가 변경되더라도 복사한 배열은 원본배열과 동일하게 변경되지 않음.
// 복사된 배열은 원본배열과는 독립적으로 사용가능

const movies = ['Harry Potter', 'Indiana Jhones', 'Jurassic Park', 'Iron man', 'Spider man']
const movies_copied = [...movies]

movies[2] = null

console.log(movies)
console.log(movies_copied)