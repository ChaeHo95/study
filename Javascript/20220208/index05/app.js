function add(...args){
    console.log(args)
    // 구현하기
  let max = 0;
  for (let arg of args) {
    if (typeof arg === "string") {
        arg = parseFloat(arg);
      }
    if (typeof arg !== "number" || isNaN(arg)) {
        arg = 0;
    }
    else{
        console.log(typeof arg,1)
        max += arg;
    }
  }
  return max;
}

// 테스트 케이스
console.log(add(3, null, 19, false, '9', [], 7, {}, '', 34, 'earth', '3.9')) // 75.9