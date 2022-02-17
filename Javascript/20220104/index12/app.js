const API_URL = 'http://makeup-api.herokuapp.com/api/v1/products.json?brand=maybelline' 

// 상품 정보에 대한 배열로부터 웹화면에 보여줄 DOM 객체로 이루어진 배열로 변환하기
// product 객체의 image_link, name, price, description 프로퍼티 사용하기
let priceShow = true
function buildElement(product){
    const div = document.createElement('div')
    div.className = 'product'
    div.innerHTML = `<img class = "product-img" src = ${product.image_link}></img>
    <h4 class = "product-name">${product.name}<br> (${product.price}$)</h4>
    <h5 class = "product-description">${product.description}<h5>`
    return div 
}

// DOM 객체로 이루어진 배열을 사용하여 웹 화면에 상품 정보 보여주기
function displayProduct(product){
   const root = document.getElementById('root')
   root.appendChild(product)
}

function down(){
    const root = document.getElementById('root')
    root.innerHTML = ''
    if(priceShow){
        console.log(priceDown)
        const ort = priceDown.map(buildElement)
        ort.forEach(displayProduct)
        priceShow = false
    }
    else{
        console.log(prePrice)
        const productsRefined = prePrice.map(buildElement)
        productsRefined.forEach(displayProduct)
        priceShow = true
    }

}
function number(user1,user2){
    const a = parseInt(user1.price)
    const b = parseInt(user2.price)
    // 자바스크립트에서는 > , < 연산자가 문자열도 비교 가능
    // 내부에서 문자열 하나씩 아스키코드로 비교함 
    if(a < b) return -1
    if(a > b) return 1
    return 0
}

fetch(API_URL)
.then(function(res){
    return res.json()
})
.then(function(products){
    // 상품 정보에 대한 배열로부터 웹화면에 보여줄 DOM 객체로 이루어진 배열로 변환하기
    const productsRefined = products.map(buildElement)
    
    // DOM 객체로 이루어진 배열을 사용하여 웹 화면에 상품 정보 보여주기
    productsRefined.forEach(displayProduct)

    priceDown = products
    prePrice = [...priceDown]
    priceDown.sort(number)
})
let priceDown = null
let prePrice = null
const price_btn = document.getElementById('price-btn')
price_btn.addEventListener('click',down)