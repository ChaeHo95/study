// * 1차원 배열을 2차원 배열로 변환하는 방법

const persons = [
    "sunrise",
    23,
    "victoria",
    19,
    "daniel",
    28,
    "ammy",
    21,
    "smith",
    32
]


const columns = 2
const rows = persons.length / columns
const _2dArray = new Array(rows).fill(0)

for(let i=0; i<rows; i++){
    const person = new Array(columns).fill(0)
    for(let j=0; j<columns; j++){
        person[j] = persons[columns*i+j] 
    }
    _2dArray[i] = person
}

console.table(_2dArray)