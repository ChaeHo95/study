function makeElement(tags, attributes, parent) {
    const tag = document.createElement(tags)
    
    for (let sub in attributes) {
        tag[sub] = attributes[sub]
    }
    if(parent != null){
        parent.appendChild(tag)
    }

    return tag
}
function testtext(){
    const text = makeElement('div',{'innerText':'완주 축하합니다.'},document.body)
    text.style.width = '100%'
    text.style.alignItems = 'center'
    text.style.justifyContent = 'center'
    text.style.textAlign = 'center'
    text.style.fontSize = '3rem'
    
}
function startAnimation(){
    const contents = document.querySelectorAll('.contents')
    for(let content of contents){
        if(!content.classList.contains('show')){
            content.classList.add('show')
        }
        else{
            content.classList.remove('show')
        }
    }
}
const section = makeElement('div',{'id':'section'},document.body)
const text = ['left','up','down','right']

let num = 0
for(let i=0; i<4; i++){
    const contents_up = makeElement('div',{'className':`contents ${text[num++]}`}, section)
    const img = makeElement('img',{'src':'game.gif'},contents_up)
    img.style.backgroundImage = 'cover' 
}

// game

const box = makeElement('div',{'id':'box'},document.body)
const bar = makeElement('div',{'id':'bar'},document.body)

const gravity = 1
const FPS = 50 
const limitBottom = 700 
const limitTop =  400

const width = window.getComputedStyle(bar).width 
const limitLeft = width

let vx = 100
let vy = 0
let isJumping = true

function down(){
    const topStyle = window.getComputedStyle(box).top
    let top = parseInt(topStyle)

    vy += gravity
    top += vy
   
    if(top >= limitBottom){
        top = limitBottom 
        isJumping = true  
    } 

    box.style.top = `${top.toString()}px`
}
const timerId = setInterval(down ,10000/FPS)

function move(e){
    console.log(box.style.left)
    console.log(hause.style.left)
    const content = document.querySelector('.contents')
    if(parseInt(box.style.left) > parseInt(hause.style.left) && !content.classList.contains('show')){
        startAnimation()
        testtext()
    }
    const leftStyle = window.getComputedStyle(box).left
    const topStyle = window.getComputedStyle(box).top
    const rightStyle = window.getComputedStyle(bar).width

    let left = parseInt(leftStyle)
    let top = parseInt(topStyle)
    let right = parseInt(rightStyle) - 115

    if(e.keyCode === 39){
        box.style.transform = 'scaleX(-1)';
        if(left < right){
            left += vx
        }
    }
    else if(e.keyCode === 37){
        box.style.transform = 'scaleX(1)';
        if(left > 0){
            left -= vx
        }
    }
    else if(e.keyCode === 32 || e.keyCode === 38){
        if(isJumping && top >= limitTop){  
            vy -= gravity
            top -= vy
        }
        if(vy <= 0){ 
            isJumping = false
        }
    }
    
    box.style.left = `${left.toString()}px` 
    box.style.top = `${top.toString()}px` 
}

const hause = makeElement('div',{'className':'hause'},document.body)
hause.style.left = `${parseInt(window.getComputedStyle(bar).width) - 105}px`
window.addEventListener('keydown', move)