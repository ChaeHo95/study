function multiplyXtimes(x){
    function multiply(y){
        return x * y
    }
    return multiply
}

const multiply3times = multiplyXtimes(3) 

console.log(multiply3times(4)) // 인자로 주어진 값에 3배를 반환
console.log(multiply3times(13)) // 인자로 주어진 값에 3배를 반환

const multiply5times = multiplyXtimes(5)

console.log(multiply5times(4)) // 인자로 주어진 값에 5배를 반환
console.log(multiply5times(13)) // 인자로 주어진 값에 5배를 반환

const multiply7times = multiplyXtimes(7)

console.log(multiply7times(4)) // 인자로 주어진 값에 7배를 반환
console.log(multiply7times(13)) // 인자로 주어진 값에 7배를 반환