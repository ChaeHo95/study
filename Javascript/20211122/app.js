// const div = document.createElement('div')
// div.className = "container"
// div.innerText = "Hello world"

// console.log(div) // 요소(element)출력
// console.dir(div) // DOM의 전체 프로퍼티 출력

// const input = document.createElement('input')
// input.className = "search-img"
// input.type = "text"
// input.placeholder = "search ..."

// console.log(input)
// // innerHTML 문자열 출력가능
// div.innerHTML = "<img src=''alt=''/>\ <p>You have happy famlily</p>"

// console.log(div)
// // img = DOM 객체
// const img = document.createElement('img')
// img.src = "http://localhost:3000"
// img.alt ='javascript'

// console.log(img)

// div.innerHTML = "<img src='' alt=''/>\ <p>You have happy family</p>"
// console.dir(div) // DOM 객체의 프로퍼티 확인

// 생성한 DOM 객체
// const div = document.createElement('div')
// div.className = "parent"
// div.innerText = "Hello Fucking World!"
// // 자식요소 생성하기(p)
// const p = document.createElement('p')
// p.className = "summary"
// p.innerText = "this is summary ! "
// // 생성한 DOM에 자식 요소 추가하기
// // img 추가한 다음 p요소가 추가됨
// const img = document.createElement('img')
// img.className = "child"
// img.src = "http://127.0.0.1:5500"
// img.alt = "photo"

// div.appendChild(img) // DOM 객체의 프로퍼티 확인
// div.appendChild(p)

// // div.append(img, p) // 여러개의 요소를 추가할떄
// console.log(div)

//마운트할 DOM 객체 생성하기
// const div =document.createElement('div')
// div.className = 'child'
// div.innerText = 'Hello World!'

// // HTML 문서에 생성한 DOM객체 실제로 마운트 하기
// const root = document.getElementById('root')
// console.log(root)
// // 부모요소인 root DOM객체에 자식인 div DOM 객체를 마운트(끼워넣기)한다
// root.appendChild(div)

// id 값이 photo인 img 요소 검색하기
// const img = document.getElementById('photo')
// console.log(img)//img: DOM객체

// const div = document.createElement('div')
// div.className = 'parent'
// div.innerText = 'Hello World!'

// const img = document.createElement('img')
// img.id = 'photo' // id 값으로 검색을 해야되니깐 id속성값을 설정
// img.src = 'http:/127.0.0.1:5500'
// img.alt = 'photo'

// const p = document.createElement('p')
// p.className = 'summary'
// p.innerText = 'this is summary'

// div.append(img,p)
// // HTML 문서에 DOM 객체를 마운트 하기 직전
// const photo = document.getElementById('photo')
// console.log(photo)
// // 마운트 하기전이라 찾지 못하여 값은 null이 출력

// // id값이 root인 div 요소에 방금 생성한 DOM객체를 마운트 하기
// const root = document.getElementById('root')
// root.appendChild(div)

// // HTML 문서에 DOM 객체를 마운트 하기 직후
// const photo2 = document.getElementById('photo')
// console.log(photo2)
// // 마운트 한 후라 찾은 값을 출력

// // id가 photo인 img 요소 검색
// const img = document.querySelector('#photo')
// console.log(img)

// // 클래스명이 summary인 p요소 검색하기
// const p =document.querySelector('.summary')
// console.log(p)

// // getElementById를 사용한 DOM객체 검색
// const img = document.getElementById('photo')
// console.log(img)
// // querySelecto를 사용한 DOM 객체 검색
// const img2 = document.querySelector('#photo')
// console.log(img2)

// const parent = document.querySelector('.parent')
// console.log(parent)
// //parent : DOM객체
// //parent 내부에서 img요소를 검색함
// const img = parent.querySelector('#photo')
// console.log(img)

// // 사진리스트의 div 요소 검색하기
// const photos = document.querySelectorAll('.photo-item')
// console.log(photos)

// // 사진리스트의 img 요소 검색하기
// const imgs = document.querySelectorAll('.photo-item img')
// console.log(imgs)

// // 사진리스트의 img 요소 검색하기
// const imgs = document.querySelectorAll('.photo-item img')

// // 배열을 이용한 각각의 DOM 객체 조회하기
// for(let img of imgs){
//     console.log(img)
// }

// const photos = document.getElementsByClassName('photo-item')

// for(let photo of photos){
//     console.log(photo)
// }

// 사진리스트의 img 요소 검색하기
// const imgs = document.getElementsByTagName('img')

// // 배열을 이용한 각각의 DOM 객체 조회하기
// for(let img of imgs){
//     console.log(img)
// }

// //부모 요소에 접근하기
// // const photos = document.querySelectorAll('.photo-item')
// // console.log(photos[0].parentElement)
// //부모 요소의 상위에 접근하기
// const photos = document.querySelectorAll('.photo-item')
// console.log(photos[0].parentElement.parentElement)
// 부모 요소 검색하기
// const photos = document.querySelectorAll('.photo-item')
// console.log(photos[0].closest('#photo-container'))
// 부모요소의 상위 부모요소 검색하기
// const photos = document.querySelectorAll('.photo-item')
// console.log(photos[0].closest('#root'))

// //자식 요소 검색하기
// const parent = document.querySelector('.parent')
// console.log(parent.children)
//자식 노드(node) 검색하기
// const parent = document.querySelector('.parent')
// console.log(parent.childNodes)
// // 부모의 첫번째 자식요소 검색
// const parent = document.querySelector('.parent')
// console.log(parent.firstElementChild)
// // 부모의 첫번째 자식노드 검색
// const parent = document.querySelector('.parent')
// console.log(parent.firstChild)
// // 부모의 마지막 자식요소 검색
// const parent = document.querySelector('.parent')
// console.log(parent.lastElementChild)
// // 부모의 마지막 자식노드 검색
// const parent = document.querySelector('.parent')
// console.log(parent.lastChild)
// // img 요소의 다음 형제요소 검색하기
// const img = document.querySelector('#photo')
// console.log(img.nextElementSibling)
// // 다음 형제노드 검색하기
// const img = document.querySelector('#photo')
// console.log(img.nextSibling)
// // 이전 형제요소 검색하기
// const img = document.querySelector('#photo')
// console.log(img.previousElementSibling)
// // 이전 형제노드 검색하기
// const img = document.querySelector('#photo')
// console.log(img.previousSibling)
// img 요소의 속성 조회하기
const img = document.querySelector('#photo')
console.log(img.id)
console.log(img.src)
console.log(img.alt)
console.log('------------------------------')

// p 요소의 속성 조회하기
const p = document.querySelector('.summary')
console.log(p.className)
console.log(p.innerText)
console.log('------------------------------')

// input 요소의 속성 조회하기
const input = document.querySelector('#search')
console.log(input.id)
console.log(input.type)
console.log(input.placeholder)