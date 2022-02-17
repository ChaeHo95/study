// * 2차원 배열을 생성하는 방법
// const _2dArray = [[1, 2], [3, 4], [5, 6], [7,8], [9, 10]]

const rows = 5
const columns = 2

const _2dArray = new Array(rows)

for(let i=0; i<rows; i++){
    const element = new Array(columns)
    for(let j=columns*i; j<columns*i+columns; j++){
        element[j-columns*i] = j+1
    }
    _2dArray[i] = element
}

console.log(_2dArray)