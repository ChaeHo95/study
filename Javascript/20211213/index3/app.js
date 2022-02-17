const parent = document.querySelector('.parent')
const child = document.getElementById('child')

function hideParent() {
    console.log('parent clicked')
    parent.classList.add('hide')
}
// 이벤트 캡쳐링과 버블링 방지
function popup(e) {
    // console.log('child clicked')
    alert('button clicked !')
    e.stopPropagation() // 이벤트 버블링 방지
}
// function clickbody(){
//     console.log('body clicked')
// }


parent.addEventListener('click', hideParent)
child.addEventListener('click', popup)
// document.body.addEventListener('click',clickbody)
// 이벤트 캡쳐링은 body 요소부터 시작해서 이벤트가 발생한 요소까지 내려가면서 이벤트핸들러 함수가 실행
// addEventListner 메서드의 세번째 인자로 true 값을 설정하면 캡쳐링으로 동작

//이벤트 버블링은 캡쳐링과는 반대로 이벤트가 발생한 요소부터 시작해서 body 요소까지 올라가면서 이벤트핸들러 함수가 실행
//addEventListner 메서드의 세번째 인자로 false 값을 설정하면 버블링으로 동작한다. 디폴트값으로 false 가 설정되어 있으므로 굳이 설정할 필요는 없음