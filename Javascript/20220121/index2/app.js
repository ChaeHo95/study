function build2DArray(rows, columns){
    const _2dArray = new Array(rows).fill(0)
    for(let i=0 ; i<_2dArray.length; i++){
        _2dArray[i] = new Array(columns).fill(0)
    } 
    return _2dArray
}

console.log(build2DArray(7, 3))
