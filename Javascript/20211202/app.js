// 이벤트핸들러 함수를 연결하는 방식
// 요소의 프로퍼티 방식
// const popupBtn = document.getElementById('popup')
// popup.onclick = function (){
//     alert('팝업창')
// }
// popupBtn.addEventListener('click',function(){
//     alert('팝업창')
// })
// function popup(){
//     alert('팝업창')
// }

// const popupBtn = document.getElementById('popup')
// popupBtn.addEventListener('click', popup)

// function popup(){
//     alert('팝업창')
// }
// function setBtnColor(){
//     popupBtn.style.background = 'skyblue'
// }
// function unsetBtnColor(){
//     popupBtn.style.background = ''
// }

// const popupBtn = document.getElementById('popup')
// popupBtn.addEventListener('click', popup)
// popupBtn.addEventListener('mouseover', setBtnColor)
// popupBtn.addEventListener('mouseout', unsetBtnColor)

// //이벤트핸들러 함수를 해제하는 방법
// function popup(){
//     alert('팝업창')
//     popupBtn.removeEventListener('click', popup)
// }

// const popupBtn = document.getElementById('popup')
// popupBtn.addEventListener('click', popup)

// //이벤트 객체
// function popup(e){
//     console.log(e) // 이벤트객체
//     console.log(e.target)
//     const target = e.target
//     // const target = e.target.style
//     target.classList.add('circle')

//     // target.all = 'unset'
//     // target.position = 'absolute'
//     // target.left = '500px'
//     // target.width = '200px'
//     // target.height = '70px'
//     // target.textAlign = 'center'
//     // target.background = 'skyblue'
//     // target.borderRadius = '50%'
//     // target.transition = 'all ease 2.5s'

// }

// const popupBtn = document.querySelector('.popup')
// popupBtn.addEventListener('click', popup)

// // 기본적인 이벤트 동작 제한하기
// const form = document.querySelector('form')
// const id = document.getElementById('user-id')
// const password = document.getElementById('user-password')
// const p = document.querySelector('p')

// function login(e){
//     if(id.value === '' || password.value === ''){
//         e.preventDefault()
//         p.innerText = '아이디나 비밀번호가 입력되지 않았습니다 !'
//     }else{
//         alert('login is processing ...')
//     }
// }
// form.addEventListener('submit', login)

// const instantMsg = document.querySelector('.instant-msg')

// function showMsg(){
//     instantMsg.classList.add('show')
// }
// function hideMsg(){
//     instantMsg.classList.remove('show')
// }

// setTimeout(showMsg, 1000)
// setTimeout(hideMsg, 3000)

// setInterval 메서드

// const clock = document.getElementById('clock')

// function changeFormat(t){
//     return t < 10 ? `0${t}` : t
// }
// function getTime(){
//     const time = new Date()
//     const hours = time.getHours()
//     const minutes = time.getMinutes()
//     const seconds = time.getSeconds()

//     clock.innerHTML = `${changeFormat(hours)}:${changeFormat(minutes)}:${changeFormat(seconds)}`
// }

// setInterval(getTime, 1000)

//이벤트종류 (키보드 이벤트, 마우스 이벤트)

// const circle = document.getElementById('circle')

// function moveCircle(e){
//     console.log(e.clientX, e.clientY)
//     const mouseX = e.clientX // 마우스 포인트의 x 좌표
//     const mouseY = e.clientY // 마우스 포인트의 y 좌표
//     circle.style.left = mouseX + 'px'
//     circle.style.top = mouseY + 'px'
// }

// window.addEventListener('click', moveCircle)

// const ledContainer = document.getElementById('led-container')
// const leds = document.querySelectorAll('.led')

// function lighton(e){
//     console.log(e.target)
//     console.log(e.target.className)

//     if(e.target.className === 'led'){
//         e.target.classList.add('on')
//     }
// }
// function lightoff(e){
//     if(e.target.className === 'led on'){
//         e.target.classList.remove('on')
//     }
// }

// ledContainer.addEventListener('mouseover', lighton)

// for(let led of leds){
//     led.addEventListener('mouseleave', lightoff)
// }

// let index = 0

// function lightoff(){
//     const led = document.querySelectorAll('.led')[index]
//     led.classList.remove('on')
// }
// function lighton(){
//     const led = document.querySelectorAll('.led')[index]
//     led.classList.add('on')
//     index++
  
//     if(index > 2){
//         index = 0
//     }
//     setTimeout(lightoff, 1000)
// }

// function startEffect(){
//     console.log('load') 
//     setInterval(lighton,1000)
// }

// window.addEventListener('load', startEffect)

const openBtn = document.getElementById('open-btn')
const sidebar = document.querySelector('.sidebar')

function openSidebar(){
    sidebar.classList.add('show')
}

openBtn.addEventListener('click', openSidebar)