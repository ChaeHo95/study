const fileInput = document.getElementById('file-input')
const imgBox = document.getElementById('img-box')
const upload = document.querySelectorAll('upload')

function isValid(type){
    return type.split('/')[0] === 'image'
}

function displayImg(e){
    console.log(e.target.files)
    const file = e.target.files[0]

    if(!isValid(file.type)){
        imgBox.innerHTML = 'File type is not valid !'
        return;
    }

    const img = document.createElement('img')
    img.src = URL.createObjectURL(file)
    imgBox.appendChild(img)
    
}

fileInput.addEventListener('change', displayImg)
upload.addEventListener('click,opFileWindow')