// // 1 
// const fruits = [['apple', 570], ['orange', 270], ['strawberry', 30]]

// for(let i in fruits){
//     fruits[i] = {name: fruits[i][0], price: fruits[i][1]}
// }

// console.log(fruits)

// 2
const fruits = [['apple', 570], ['orange', 270], ['strawberry', 30]]

for(let i in fruits){
    const fruit = {}
    for(let j in fruits[i]){
        switch(j){
            case '0':
                fruit['name'] = fruits[i][j]
                break;
            case '1':
                fruit['price'] = fruits[i][j]
                break;
        }
    }
    fruits[i] = fruit
}

console.log(fruits)