function add(a, b){
    return a + b
}

add['description'] = 'add two numbers'
add['parameter-info'] = function(){
    console.log(`parameters: ${add.name} function needs ${add.length} parameters`)
}

console.dir(add)

console.log('--- function information ---')
console.log('description: ', add['description'])
add["parameter-info"]()