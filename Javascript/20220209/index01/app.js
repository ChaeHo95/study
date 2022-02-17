const numbers = ["1", "2", "3", "4", "5", "6", "7", "8", "9", "10"]

function map(f, arr){
    const newArr = []
    for(let i in arr){
        newArr[i] = f(arr[i])
    }
    return newArr
}

function str2num(element){
    return parseInt(element)
}

const numbersParsed = map(str2num, numbers)
console.log(numbersParsed)