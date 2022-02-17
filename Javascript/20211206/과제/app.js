const boxes = document.querySelectorAll('.box')

let cnt = 0
let pre = 0

function moveUP(){
    pre = cnt

    cnt = cnt === boxes.length - 1 ? 0 : cnt + 1

    boxes[cnt].style.marginBottom =  '50px'
    boxes[pre].style.marginBottom = '0px'
}

function startMove(){
    setInterval(moveUP, 250)
}

window.addEventListener('load', startMove)