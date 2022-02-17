const API_URL = 'http://makeup-api.herokuapp.com/api/v1/products.json?brand=maybelline' 

fetch(API_URL)
.then(function(res){
    return res.json()
})
.then(function(products){
     //console.log(products)
     products.forEach(product => {
     if(product.product_type === 'lipstick' && parseFloat(product.rating) >= 4 && parseFloat(product.rating) <= 5){
         console.log(product)
     }
    })
})