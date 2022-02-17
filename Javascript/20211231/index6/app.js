const API_URL = 'http://makeup-api.herokuapp.com/api/v1/products.json?brand=maybelline' 

fetch(API_URL)
.then(function(res){
    return res.json()
})
.then(function(products){
    console.log(products)

    //조건에 맞는 상품 검색하기
    
    products.forEach(product => {
        if(product.product_type === 'mascara' && parseInt(product.price) < 10)
        console.log(product)
    })  
})