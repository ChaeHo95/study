const menuContainer = document.getElementById('menu-container')

function openMenu(e){
    const target = e.target
    if(target.className === 'title'){
        console.dir(target)
        target.nextElementSibling.classList.toggle('open')
    }
}

menuContainer.addEventListener('click', openMenu)