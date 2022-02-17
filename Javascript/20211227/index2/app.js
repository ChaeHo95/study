// 배열 생성방법 (리터럴, Array 생성자함수 사용과 차이점)
// Array 생성자 함수를 사용하는 방법

const fruits = []

fruits[0] = 'apple'
fruits[1] = 'banana'
fruits[2] = 'orange'

// const fruits = ['apple', 'banana', 'orange']

for(let i=0; i<fruits.length; i++){
    console.log('I like ', fruits[i])
}


// 값을 할당하지 않고 배열의 크기를 지정하려면 위와 같이 쉼표를 사용

const fruits = [,,,]

// const fruits = new Array(3)

for(let i=0; i<fruits.length; i++){
    console.log('I like ', fruits[i])
}


//생성자함수로 배열을 생성하면서 크기를 지정하고 초기값을 모두 0 으로 채움

const fruits = new Array(3).fill(0)

for(let i=0; i<fruits.length; i++){
    console.log('I like ', fruits[i])
}