// * 2차원 배열을 조회하는 방법
const fruits = [['apple', 570], ['orange', 270], ['strawberry', 30]]

for(let fruit of fruits){
    for(let i in fruit){
        switch(i){
            case '0':
                console.log('name', fruit[i])
                break;
            case '1': 
                console.log('price', fruit[i])
                break;
        }
    }
}