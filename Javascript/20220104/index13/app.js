const API_URL =
  "http://makeup-api.herokuapp.com/api/v1/products.json?brand=maybelline";

// 상품 정보에 대한 배열로부터 웹화면에 보여줄 DOM 객체로 이루어진 배열로 변환하기
// product 객체의 image_link, name, price, description 프로퍼티 사용하기
let priceShow = true;
let text = null;

function buildElement(product) {
  const div = document.createElement("div");
  div.className = "product";
  div.innerHTML = `<img class = "product-img" src = ${product.image_link}></img>
    <div class = "product-name">${product.name}<br> (${product.price}$)</div>
    <div class = "product-description">${product.description}<h5>
    <div class ='product-type'>${product.product_type}</div>`
  if (text != null) {
    console.log(product.name);
    const nameTitle = div.querySelector('.product-type').innerText
    disynone(div, nameTitle);
  }
  return div;
}

// DOM 객체로 이루어진 배열을 사용하여 웹 화면에 상품 정보 보여주기
function displayProduct(product) {
  const root = document.getElementById("root");
  root.appendChild(product);
}
function down() {
  const root = document.getElementById("root");
  root.innerHTML = "";
  if (priceShow) {
    show(priceDown);
    priceShow = false;
  } else {
    show(prePrice);
    priceShow = true;
  }
}
function show(els) {
  console.log(els);
  const productsRefined = els.map(buildElement);
  productsRefined.forEach(displayProduct);
}
function number(user1, user2) {
  const a = parseFloat(user1.price);
  const b = parseFloat(user2.price);
  // 자바스크립트에서는 > , < 연산자가 문자열도 비교 가능
  // 내부에서 문자열 하나씩 아스키코드로 비교함
  if (a < b) return -1;
  if (a > b) return 1;
  return 0;
}
function filter() {
  text = document.getElementById("search-input").value.toLowerCase();
  const products = document.querySelectorAll(".product");
  console.log(products.length);

  for (let product of products) {
    console.log(product.querySelector(".product-type").innerText.toLowerCase());
    const nameTitle = product.querySelector(".product-type").innerText.toLowerCase();
    disynone(product, nameTitle);
  }
}
function disynone(ele, name) {
  if (name.includes(text)) {
    ele.style.display = "";
  } else {
    ele.style.display = "none";
  }
}
fetch(API_URL)
  .then(function (res) {
    return res.json();
  })
  .then(function (products) {
    // 상품 정보에 대한 배열로부터 웹화면에 보여줄 DOM 객체로 이루어진 배열로 변환하기
    const productsRefined = products.map(buildElement);

    // DOM 객체로 이루어진 배열을 사용하여 웹 화면에 상품 정보 보여주기
    productsRefined.forEach(displayProduct);

    priceDown = products;
    prePrice = [...priceDown];
    priceDown.sort(number);
  });
let priceDown = null;
let prePrice = null;
const price_btn = document.getElementById("price-btn");
price_btn.addEventListener("click", down);
const search_input = document.getElementById("search-input");
search_input.addEventListener("input", filter);