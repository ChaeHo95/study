const ftuits = document.querySelectorAll('.fruit')
let prevTarget = null
function moveToRight(e) {

    // 바로 전에 클릭한 타켓의 위치 초기화
    if (prevTarget != null) {
        prevTarget.style.marginLeft = '0px'
    }

    // 현재 클릭한 타켓의 위치 변경
    const target = e.target
    target.style.marginLeft = '100px'

    // 현재 타켓 저장
    prevTarget = target
}

for (let fruit of ftuits) {
    fruit.addEventListener('click', moveToRight)
}