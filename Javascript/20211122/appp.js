const photo_container = document.createElement('div')
photo_container.id = 'photo-container'
const photo_item = [];

const root = document.getElementById('root')
root.appendChild(photo_container)

for(i=0; i < 5; i++){
    photo_item[i] = document.createElement('div')
    photo_item[i].className = 'photo-item'
    photo_item[i].innerHTML = '<img src=\"http://127.0.0.1:5500/indexx.html\" alt =\"photo\"/>'
    photo_container.append(photo_item[i])
}
const imgs = document.querySelectorAll('.photo-item img')

for(let img of imgs){
    console.log(img)
}
const parent = document.querySelector('#photo-container')
console.log(parent.firstElementChild)

console.log(imgs[0].alt)