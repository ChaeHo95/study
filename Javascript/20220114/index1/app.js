// * 2차원 배열을 생성하는 방법
// const _2dArray = [[1, 2], [3, 4], [5, 6], [7,8], [9, 10]]

const _2dArray = []

for(let i=0; i<5; i++){
    const element = []
    for(let j=2*i; j<2*i+2; j++){
        element.push(j+1)
    }
    _2dArray.push(element)
}

console.log(_2dArray)