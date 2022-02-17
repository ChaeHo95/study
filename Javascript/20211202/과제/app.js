function makeDiv(attributes, tag, parent) {
    const div = document.createElement(tag)
    for (let key in attributes) {
        div[key] = attributes[key]
    }
    if (parent != null) {
        parent.appendChild(div)
    }
    return div;
}
function color(){
    const R = Math.floor(Math.random() * 255)
    const G = Math.floor(Math.random() * 255)
    const B = Math.floor(Math.random() * 255)
    const color = `rgb(${R},${G},${B})`
    return color
}
function colorChange(e){
    e.target.style.background = color()
}
function lighton(e) {
    if (e.target.className === 'colourBox') {
        e.target.classList.add('on')
    }
    e.target.style.color = color()
}
function lightoff(e) {
    if (e.target.className === 'colourBox on') {
        e.target.classList.remove('on')
    }
}
function changeFormat(t){
    return t < 10 ? `0${t}` : t
}
function getTime(){
    const time = new Date()
    const hours = time.getHours()
    const minutes = time.getMinutes()
    const seconds = time.getSeconds()
    
    clock.innerHTML = `<div class='hours'>${changeFormat(hours)}</div><div class='minutes'>:${changeFormat(minutes)}</div><div class='seconds'>:${changeFormat(seconds)}</div>`
    timeColorChage()
}
function timeColorChage(){
    const timeArray = ['.hours','.minutes','.seconds']
    for(let tc of timeArray){
        const div = document.querySelector(tc)
        div.style.color = color()
    }
}

const nav = makeDiv({ 'id': 'nav' }, 'div')
const clock = makeDiv({'id' : 'clock'},'div',nav)
const array = new Array(9).fill(null)
const arrayname = ['이름','생년월일','성별','병역사항','연락처','주소','학력사항','자격증','경력']
for (let i in array) {
    array[i] = makeDiv({ 'className': 'colourBox','innerText' : arrayname[i] }, 'div', nav)
}
for (let a of array) {
    a.style.background = color()
    a.addEventListener('mouseover', lighton)
    a.addEventListener('mouseleave', lightoff)
    a.addEventListener('click', colorChange)
    
}

setInterval(getTime, 1000)
document.body.append(nav)