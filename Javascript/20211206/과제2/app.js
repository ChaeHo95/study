const photos = document.getElementById('photos')
const photoItems = photos.querySelectorAll('.photo')
const options = document.querySelectorAll('.options')
const selections = document.getElementById('selection')

let timerID = null
let cnt = 0
let prevOption = 0

function changePosition(){

    cnt = cnt === photoItems.length - 1 ? 0 : cnt + 1
    // 사진을 한장씩 이동하기 위해서
    photos.style.marginLeft = cnt * -500 + 'px'

    // 셀렉터 구현
    options[prevOption].style.width = 20 + 'px' // 이전 셀렉터 초기화
    options[cnt].style.width = 50 + 'px' // 현재 셀렉터 변경
    options[cnt].style.borderRaidus = '5px'
    prevOption = cnt // 현재 셀렉터 인덱스 저장
}
function clickPosition(e){
    for(let i=0; i < options.length; i++){
        if(e.target.className == 'options' && window.getComputedStyle(options[i]).cursor == 'pointer'){ 
            console.log(window.getComputedStyle(options[i]).backgroundColor )
            cnt = i
    }
    }
    
    // 사진을 한장씩 이동하기 위해서
    photos.style.marginLeft = cnt * -500 + 'px'

    // 셀렉터 구현
    options[prevOption].style.width = 20 + 'px' // 이전 셀렉터 초기화
    options[cnt].style.width = 50 + 'px' // 현재 셀렉터 변경
    options[cnt].style.borderRaidus = '5px'
    prevOption = cnt // 현재 셀렉터 인덱스 저장
}

function startCarousel(){
    timerID = setInterval(changePosition, 1000)
}

function stopCarousel(){
    clearInterval(timerID) // 정지시키기 위해서
}

function clicks(e){
    const obj = e.target
    
    for(let num=0; num<options.length; num++){
        if( obj.className == 'options' && obj === options[num]){
            cnt = num
        }
    }
     // 사진을 한장씩 이동하기 위해서
     photos.style.marginLeft = cnt * -500 + 'px'

     // 셀렉터 구현
     options[prevOption].style.width = 20 + 'px' // 이전 셀렉터 초기화
     options[cnt].style.width = 50 + 'px' // 현재 셀렉터 변경
     options[cnt].style.borderRaidus = '5px'
     prevOption = cnt // 현재 셀렉터 인덱스 저장
}
function findIndex(target){
    for(i=0;i<options.length;i++){
        if(options[i] === target) return i
    }
}
function changePosition(e){
    removeToggle()
    if(e == null){
        cnt = cnt > options.length-2 ? 0 : cnt+1;
    }
    else{
    const target = e.target;
    cnt = findIndex(target)
    }
    photos.style.marginLeft = cnt * -500 + 'px';
    options[cnt].classList.add('selcet');
}
selections.addEventListener('click',clicks)
photos.addEventListener('mouseenter', startCarousel)
photos.addEventListener('mouseleave', stopCarousel)

