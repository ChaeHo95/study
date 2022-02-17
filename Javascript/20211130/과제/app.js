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

const nav = makeDiv({ 'id': 'nav' }, 'div')
const navChild = ['menu', 'screen-mode', 'profile-menu']

for (var i = 0; i < navChild.length; i++) {
    const Child = makeDiv({ 'id': navChild[i] }, 'div', nav)
    switch (i) {
        case 0:
            for (var j = 0; j < 3; j++) {
                makeDiv({ 'className': 'bar' }, 'div', Child)
            }
            break;
        case 1:
            makeDiv({ 'id': 'circle-btn' }, 'div', Child)
            break;
        case 2:
            makeDiv({ 'id': 'profile-menu', 'src': './photo/NAGATORO.gif' }, 'img', Child)
            break;

    }
}

const title = makeDiv({ 'id': 'title' }, 'div')
const titleChild = ['center', 'search']
for (var i = 0; i < titleChild.length; i++) {
    const Child = makeDiv({ 'id': titleChild[i] }, 'div', title)
    switch (i) {
        case 0:
            makeDiv({
                'id': 'heading',
                'innerHTML': '<h1>My photo gallery</h1>\n<h3>my old memories from my life</h3>',
            },'div', Child)
            break;
        case 1:
            makeDiv({'type' : 'text','placeholder':'Search photo ... '},'input',Child)
            break;
    }
}

const photo_list = makeDiv({'id' : 'photo-list'},'div')
photo_names = ['방긋^^', '흠~', 'ㅋㅋㅋㅋㅋ', '풋!', '우와~!', '이건 내꺼!', '하하하', '뭐지...', '뭘 잘못했는데??']
for (var i = 0; i < 9; i++) {
    const photo_container = makeDiv({'className' : 'photo-container'},'div',photo_list)
    const photo_card = makeDiv({'className':'photo-card'},'div',photo_container)
    const img = makeDiv({'src':'./photo/NAGATORO' + String(i) + '.gif',
                    'alt':''},'img',photo_card)
    const photo_name = makeDiv({'className':'photo-name',
                    'innerText': photo_names[i]},'div',photo_container)
}

const modal_window = makeDiv({'className' : 'modal-window'},'div')
const header = makeDiv({'id' : 'header','innerText' : 'Warning'},'div',modal_window)
const body = makeDiv({'id':'body','innerHTML': '<p>Warning</p>'},'div',modal_window)
const footer = makeDiv({'id':'footer','innerHTML':'<button>Close</button>'},'div',modal_window)

document.body.append(nav, title, photo_list,modal_window)