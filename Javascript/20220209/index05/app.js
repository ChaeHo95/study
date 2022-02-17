function makeAdder(){
    let a = 0
    let b = 0
    let c = 0
    function addNums(){
        return ++a + ++b + ++c
    }
    return addNums
}

const adder1 = makeAdder()
const adder2 = makeAdder()
const adder3 = makeAdder()


console.log(adder1())
console.log(adder2())
console.log(adder3())