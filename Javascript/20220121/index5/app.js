// // 1
// const graph = document.getElementById('graph')

// let points = [] // 포인트 배열
// let x = 0 // degree
// let offset = 0 // 추출 시작점

// function degreeToRad(x){
//     return x * (Math.PI / 180)
// }
// function calSinVal(x){
//     return Math.sin(x)
// }
// function clearWindow(el){
//     el.innerHTML = ''
// }
// function getPoint(x){
//     return [x, calSinVal(degreeToRad(x))]
// }
// function isArrayFull(len){
//     return len > 360
// }

// function displayPoint(point){
//     const [x, y] = point
//     const xScale = 2, yScale = 100, yShift = 100

//     const pointEl = document.createElement('div')
//     pointEl.className = 'dot'
//     pointEl.style.left = `${(x - offset) * xScale}px` // x-scale: 2배 (offset 만큼 좌표이동)
//     pointEl.style.top = `${(y* yScale) * -1 + yShift}px` // y-scale : 100배 (반전 + 좌표이동)
//     graph.appendChild(pointEl)
// }

// function redraw(){
//     clearWindow(graph)
    
//     points.push(getPoint(x)) // 포인트 추가
//     x++ // x 좌표 변경

//     if(isArrayFull(points.length)){
//         points.shift() // 첫번째 요소를 제거함으로써 360개 유지
//         offset++ //  offset 증가
//     }
//     points.forEach(displayPoint) // 화면에 그래프 그리기
  
// }

// setInterval(redraw, 5)

// // 2

// const graph = document.getElementById('graph')

// const points = []
// const dx = 1 // degree
// let x = 0 // degree
// let y = 0
// let radx = 0 // radian
// let offset = 0 // 추출 시작점
// let points360 = [] // 360개만 추출하기
// const range = 360 // 추출 갯수

// // 다음 (X,Y) 포인트 값 계산
// function getNextPoint(){
//     radx = x * (Math.PI / 180)
//     y = Math.sin(radx)
//     points.push([x, y])
//     x += dx
// }


// // (X,Y) 포인트 값으로부터 DOM 객체 생성 및 화면에 표시
// function displayPoint(point){
//     const pointEl = document.createElement('div')
//     pointEl.className = 'dot'
//     pointEl.style.left = `${(point[0] - offset) * 2}px` // x-scale: 2배 (offset 만큼 좌표이동)
//     pointEl.style.top = `${point[1]* 100 * -1 + 100}px` // y-scale : 100배 (반전 + 좌표이동)
//     graph.appendChild(pointEl)
// }

// function redraw(){
//     graph.innerHTML = '' // 화면 초기화
//     getNextPoint()

//     if(points.length <= 360){
//         points.forEach(displayPoint)
//     }else{
//         points360 = points.slice(offset, offset + range) // 360개만 추출하기
//         points360.forEach(displayPoint)
//         offset++
//     }
// }

// // (X,Y) 포인트 값을 요소로 가지는 2차원 배열 생성
// const timerID = setInterval(redraw, 5)

// 3

const graph = document.getElementById('graph')

let points = []
const dx = 1 // degree
let x = 0 // degree
let y = 0
let radx = 0 // radian
let offset = 0 // 추출 시작점
let points360 = [] // 360개만 추출하기
const range = 360 // 추출 갯수

// 다음 (X,Y) 포인트 값 계산
function getNextPoint(){
    radx = x * (Math.PI / 180)
    y = Math.sin(radx)
    points.push([x, y])
    x += dx
}


// (X,Y) 포인트 값으로부터 DOM 객체 생성 및 화면에 표시
function displayPoint(point){
    const pointEl = document.createElement('div')
    pointEl.className = 'dot'
    pointEl.style.left = `${(point[0] - offset) * 2}px` // x-scale: 2배 (offset 만큼 좌표이동)
    pointEl.style.top = `${point[1]* 100 * -1 + 100}px` // y-scale : 100배 (반전 + 좌표이동)
    graph.appendChild(pointEl)
}

function redraw(){
    graph.innerHTML = '' // 화면 초기화
    getNextPoint()

    if(points.length > 360){
        points.shift() // 360개를 초과한 경우 첫번째 요소를 제거함으로써 360개 유지
        offset++
    }
    points.forEach(displayPoint)
    // console.log(points)
}

// (X,Y) 포인트 값을 요소로 가지는 2차원 배열 생성
const timerID = setInterval(redraw, 5)