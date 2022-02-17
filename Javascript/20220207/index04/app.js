// // 화살표 함수

// const 함수이름 = (파라미터1, 파라미터2, ...) => {
// 	코드블럭
    
//     return 반환값
// }

const launguage = ['korean', 'japanese', 'english', 'chinese', 'russian']

const copyArr = (arr) => {
    const copiedArr = []

    for(let element of arr){
        copiedArr.push(element)
    }

    return copiedArr
}

const copiedArr = copyArr(launguage)
console.log(copiedArr)

// 화살표 함수는 function 키워드 대신에 화살표(=>)를 사용하여 함수를 정의한다. 
// 함수선언이나 함수 표현식에 비하여 좀 더 간결하게 함수를 정의할 수 있어서 
// 간단한 코드블럭을 가진 함수 정의에 많이 사용

