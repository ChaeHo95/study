// 함수는 함수이름에 명시된 대로 정확히 하나의 기능을 수행하는 것이 좋다.
// subtract 함수는 인자로 주어진 값을 이용하여 뺄셈만 수행해야 하지만,
//  인자로 주어진 값을 비교하는 기능도 포함되어 있다. 
// 이러한 경우에는 비교함수를 따로 만들어주는 것이 좋다. 

function compare(a, b){
    if(a > b) return true
    else return false
}

function subtract(a, b){
    return compare(a, b) ?  (a - b) : (b - a)
}