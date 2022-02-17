// 배열 정렬하기 (sort, reverse) 
// [배열].sort()

// 알파벳 순으로 오름차순 정렬
let words = ['car', 'paper', 'mobile', 'computer', 'school', 'sun', 'house']

words.sort()

console.log(words)

// 알파벳 순으로 내림차순 정렬

words = ['car', 'paper', 'mobile', 'computer', 'school', 'sun', 'house']

words.sort()

console.log(words.reverse())

// 숫자 정렬 시

// [배열].sort(비교함수)

// function 비교함수 이름(배열요소 1, 배열요소 2){

// 	if(배열요소 1 > 배열요소 2) return 1 
//     // 배열요소 1 이 크면 반환값 1을 설정함으로써 순서를 변경함
    
//     if(배열요소 1 < 배열요소 2) return -1 
//     // 배열요소 1이 작으면 반환값 -1을 설정함으로써 순서를 변경하지 않음
//     return 0
// }

const numbers = [100, 3, 394, 27, 4, 82, 6, 5, 94]

// 숫자 오름차순 정렬하기
function compareNumbers(a, b){
    if(a > b) return 1 // 앞의 숫자(a)가 뒤의 숫자(b)보다 크면 순서를 변경함 (1을 반환하면 순서를 변경함)
    if(a < b) return -1 // 앞의 숫자(a)가 뒤의 숫자(b)보다 작으면 순서를 변경하지 않음 (-1을 반환하면 순서를 변경하지 않음)
    return 0 // 두 숫자가 동일하면 순서를 변경하지 않음
}
numbers.sort(compareNumbers)

console.log(numbers)