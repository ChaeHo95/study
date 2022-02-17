const fruits = [['apple', 570, 32], ['orange', 270, 65], ['strawberry', 30, 120]]

for(let fruit of fruits){
    fruit.splice(1, 2, fruit[1] * fruit[2])
}

for(let i in fruits){
    fruits[i] = {name: fruits[i][0], totalPrice: fruits[i][1]}
}

console.log(fruits)