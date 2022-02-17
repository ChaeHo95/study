const fileInput = document.getElementById('file-input')
const imgBox = document.getElementById('img-box')

function isValid(type){
    return type.split('/')[0] === 'image'
}

function displayImg(e){
    // 사용자가 업로드한 파일 데이터로 접근
    console.log(e.target.files) 
    const file = e.target.files[0]

    // file.type : 'image/jpeg'
    // 이미지가 아닌 경우 아무것도 안하고 반환해줌 => 데이터 유효성 r검증 
    if(!isValid(file.type)){
        imgBox.innerHTML = 'File type is not valid !'
        return;
    }

    const img = document.createElement('img')
    img.src = URL.createObjectURL(file) // 이미지 경로를 생성해줌
    imgBox.appendChild(img)
    
}

fileInput.addEventListener('change', displayImg)