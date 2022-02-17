// getDistance 함수 구현하기
function getDistance(a , b = {x: 0, y:0}){
    console.log(a)
    console.log(b)
    return Math.sqrt(Math.pow(a.x - b.x,2) + (a.y - b.y)**2)
}
// pow 제곱
// sprt 루트

 // 테스트 케이스
 console.log(getDistance({x: 3, y: 2}, {x: 8, y: 14}))
 console.log(getDistance({x: 3, y: 4}))