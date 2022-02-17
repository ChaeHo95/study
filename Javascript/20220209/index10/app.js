const fruit = 'apple'
let printB = null

function printA(){
    const fruit = 'banana'

    printB = function(){
        console.log(fruit)
    }

    printB()
    
}

printA() // banana
printB() // banana