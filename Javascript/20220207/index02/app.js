const launguage = ['korean', 'japanese', 'english', 'chinese', 'russian']

// 배열 복사하기
function copyArr(arr){
    const copiedArr = []

    for(let element of arr){
        copiedArr.push(element)
    }

    return copiedArr
}

const copiedArr = copyArr(launguage)
console.log('check array is same: ', launguage === copiedArr) // 두 배열의 참조값이 같은지 검사
console.log(copiedArr)