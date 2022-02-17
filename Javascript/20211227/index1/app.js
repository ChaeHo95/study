const fruits = ["apple", "banana", "orange", "watermelon", "strawberry"]

// Array.isArray(타입검사에 사용할 변수)

Array.isArray(["apple", "orange", "banana"]);  // true
Array.isArray({name: 'syleemomo', age: 23}); // false
Array.isArray('syleemomo');   // false
Array.isArray(undefined);  // false
Array.isArray(null);  // false
Array.isArray(3);  // false

// 자바스크립트 배열은 실제로는 객체라서 어떤 자료형도 넣을수 있다.

const mixedArray = [
    'apple', 3, undefined, [1,4, 7, 2], null, 
    {movieTitle: 'Harry potter', release: '2019-02-13'}, 3.131592]
    
console.log(mixedArray)
