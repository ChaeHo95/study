const box = document.getElementById('box')
const gravity = 1
const FPS = 60 
const limitBottom = 500 
const limitTop =  490 
const limitLeft = 700

let vx = 100
let vy = 0
let isJumping = true
let isDead = false

function down(){
    const topStyle = window.getComputedStyle(box).top
    let top = parseInt(topStyle)

    vy += gravity
    top += vy
   
    if(!isDead && top >= limitBottom){
        top = limitBottom 
        isJumping = true  
    } 

    box.style.top = `${top.toString()}px`
}
const timerId = setInterval(down ,10000/FPS)


function move(e){
   
    const leftStyle = window.getComputedStyle(box).left
    const topStyle = window.getComputedStyle(box).top
    let left = parseInt(leftStyle)
    let top = parseInt(topStyle)

    if(e.keyCode === 39){
        box.style.backgroundImage = "url('super-mario-right.jpg')";
        left += vx
        if(left > limitLeft){
            isDead = true
        }
    }
    else if(e.keyCode === 37){
        box.style.backgroundImage = "url('super-mario-left.jpg')";
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
 
window.addEventListener('keydown', move)