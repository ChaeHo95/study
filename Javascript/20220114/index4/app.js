// * 2차원 배열을 변경하는 방법
const fruits = [['apple', 570], ['orange', 270], ['strawberry', 30]]

for(let fruit of fruits){
    fruit.push(Math.floor(Math.random()*100 + 1))
}

console.log(fruits)