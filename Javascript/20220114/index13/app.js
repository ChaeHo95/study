// * 그래프 그리기

const graph = document.getElementById('graph')

const points = []
const dx = 1 // degree
let x = 0 // degree
let y = 0
let radx = 0 // radian

// 다음 (X,Y) 포인트 값 계산
function getNextPoint(){
    radx = x * (Math.PI / 180)
    y = Math.sin(radx)
    points.push([x, y])
    x += dx
    // console.log(points)
}


// (X,Y) 포인트 값으로부터 DOM 객체 생성 및 화면에 표시
function displayPoint(point){
    const pointEl = document.createElement('div')
    pointEl.className = 'dot'
    pointEl.style.left = `${point[0] * 2}px` // x-scale: 2배
    pointEl.style.top = `${point[1]* 100 * -1 + 100}px` // y-scale : 100배 (반전 + 좌표이동)
    graph.appendChild(pointEl)
}

// (X,Y) 포인트 값을 요소로 가지는 2차원 배열 생성
for(let i=0; i<360; i++){
    getNextPoint()
}
console.log(points)

points.forEach(displayPoint)