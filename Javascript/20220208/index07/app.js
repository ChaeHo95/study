const numbers = [121, 23, 345, 43, 59]

function pickIndex(len){
    return Math.floor(Math.random() * len)
}
function shuffle(arr){
    // 구현하기
      arr.forEach((value,index,element) => {
      const num = pickIndex(arr.lenth)
      const copy = value
      element[index] = element[num]
      element[index] = copy
      console.log(copy,element[index],element[num])
    }); 

    return arr
}

console.log(shuffle(numbers))