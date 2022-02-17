function makeElement(divs,keys,ty){
    const div = document.createElement(divs)
    for(let value in keys){
        div[value] = keys[value]
    }
    if(ty != null){
        ty.appendChild(div)
    }
    return div

}
let attributes = {'innerText' : '빅데이터 연습'}

const haed = makeElement('h1', attributes)

attributes = {'className' : 'bigdata'}

const digdate = makeElement('div',attributes)

attributes = {'src' : 'exam_data.html'}

const iframe = makeElement('iframe',attributes, digdate)

document.body.append(haed, digdate)

// for (variable in object) { ... }
// variable
// 매번 반복마다 다른 속성이름(Value name)이 변수(variable)로 지정됩니다.
// object
// 반복작업을 수행할 객체로 열거형 속성을 가지고 있는 객체.
