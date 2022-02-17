function add(a, b){
    return a + b
}
function subtract(a, b){
    return a - b
}
function multiply(a, b){
    return a * b
}
function divider(a, b){
    return a / b
}

function calculator(mode, a, b, ...funcs){
    let ret = null
    switch(mode){
        case '+':
            ret = funcs[0](a, b)
            break
        case '-':
            ret = funcs[1](a, b)
            break
        case '*':
            ret = funcs[2](a, b)
            break
        case '/':
            ret= funcs[3](a, b)
            break
    }
    return ret
}

const ret1 = calculator('+', 3, 4, add, subtract, multiply, divider)
const ret2 = calculator('-', 3, 4, add, subtract, multiply, divider)
const ret3 = calculator('*', 3, 4, add, subtract, multiply, divider)
const ret4 = calculator('/', 3, 4, add, subtract, multiply, divider)

console.log(ret1)
console.log(ret2)
console.log(ret3)
console.log(ret4)