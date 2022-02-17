const API_URL = 'http://makeup-api.herokuapp.com/api/v1/products.json?brand=maybelline' 

// 상품 정보에 대한 배열로부터 웹화면에 보여줄 DOM 객체로 이루어진 배열로 변환하기
// product 객체의 image_link, name, price, description 프로퍼티 사용하기
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
fetch(API_URL)
.then(function(res){
    return res.json()
})
.then(function(products){
    console.log(products)

    // 상품 정보에 대한 배열로부터 웹화면에 보여줄 DOM 객체로 이루어진 배열로 변환하기
    const productsRefined = products.map(buildElement)
    
    // DOM 객체로 이루어진 배열을 사용하여 웹 화면에 상품 정보 보여주기
    productsRefined.forEach(displayProduct)
})