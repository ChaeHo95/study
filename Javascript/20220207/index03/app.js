// // 함수 표현식

// const 함수이름 = function (파라미터1, 파라미터2, ...){
// 	코드블럭
    
//     return 반환값
// }

// 함수선언과 함수 표현식의 차이점

// const launguage = ['korean', 'japanese', 'english', 'chinese', 'russian']

// const copiedArr = copyArr(launguage)
// console.log(copiedArr)

// function copyArr(arr){
//     const copiedArr = []

//     for(let element of arr){
//         copiedArr.push(element)
//     }

//     return copiedArr
// }

// 함수선언으로 정의한 copyArr 함수는 function 키워드로 정의하기 전에 호출이 가능 
// 이를 함수 호이스팅

const launguage = ['korean', 'japanese', 'english', 'chinese', 'russian']

const copiedArr = copyArr(launguage)
console.log(copiedArr)

const copyArr = function(arr){
    const copiedArr = []

    for(let element of arr){
        copiedArr.push(element)
    }

    return copiedArr
}

//  함수 표현식으로 정의한 copyArr 함수는 function 키워드로 정의하기 전에 호출하면 아래와 같은 에러를 발생시킨다.
// 즉, 함수 호이스팅이 불가능