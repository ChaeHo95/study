const pageConents = [] //데이터 리스트를 담고 있는 배열
const numOfData = 100 // 전체 리스트 수
const limit = 7
const numOfBtns = Math.ceil(numOfData / limit) //페이지네이션 버튼 개수
let offset = 0

const comtents = document.getElementById('contents')
const pageBtns = document.getElementById('page-btns')

// 리스트 배열 만들기
for (let i = 0; i < numOfData; i++) {
    pageConents.push({ name: 'sunise', age: 23, id: i })
}
// 페이지네이션 버튼 보여주기
for (let i = 0; i < numOfBtns; i++) {
    const btn = document.createElement('button')
    btn.className = 'page-btn'
    btn.innerText = i + 1

    pageBtns.appendChild(btn)
}

//첫페이지 보여주기
for (let i = 0; i < offset + limit; i++) {
    const listItem = pageConents[i]
    comtents.innerHTML += `
    <div id= ${listItem} class='list-item'>
    <h3>${listItem.name}(${listItem.id})</h3>
    <h3>${listItem.age}</h3>
    </div>
    `
}

function changePage(e) {
    const target = e.target
    // 페이지네이션 버튼을 클릭한 경우
    if (target.className === 'page-btn') {
        const indexSelected = parseInt(target.innerText - 1)
        offset = limit * indexSelected

        const listSeleted = []
        // offset~offset+limit - 1까지의 리스트만 추출하기
        for (let i = offset; i < offset + limit; i++) {
            const item = pageConents[i]
            listSeleted.push(item)
        }
        // 화면 초기화
        contents.innerHTML = ''

        // 화면에 추출한 데이터 리스트만 보여주기
        for (let listItem of listSeleted) {
            comtents.innerHTML += `
            <div id=${listItem.id} class='list-item'>
            <h3>${listItem.name} (${listItem.id})</h3>
            <h3>${listItem.age}</h3>
        </div>
            `
        }
    }
}
pageBtns.addEventListener('click', changePage)