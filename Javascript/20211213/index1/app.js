const pageContents = [
    'page1', 'page2', 'page3', 'page4', 'page5',
    'page6', 'page7', 'page8', 'page9', 'page10',]


const contents = document.getElementById('contents')
const pageBtns = document.getElementById('page-btns')

for (let i = 0; i < pageContents.length; i++) {
    const btn = document.createElement('button')
    btn.className = 'page-btn'
    btn.innerText = i + 1

    pageBtns.appendChild(btn)
}

contents.innerHTML = pageContents[0]

function changePage(e) {
    const target = e.target
    // 페이지네이션 버튼을 클릭한 경우
    if (target.className === 'page-btn') {
        const indexSelected = parseInt(target.innerText - 1)
        contents.innerHTML = pageContents[indexSelected]
    }
}

pageBtns.addEventListener('click', changePage)
