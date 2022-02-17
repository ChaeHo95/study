// arguments 객체의 배열요소들은 함수의 입력값으로 전달된 각각의 인자를 가리킴

function add(a, b){
    console.log(arguments) // arguments 객체
    
    console.log(arguments[0]) // 함수의 첫번째 인자
    console.log(arguments[1]) // 함수의 두번째 인자
    console.log(arguments.length) // 함수 인자의 갯수
    
    console.log(arguments.callee) // add 함수 자체
}

add("apple", 'banana')