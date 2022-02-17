// divider 함수 구현하기
function divider(...num){
  const result_list = []
  if(num[0] === 0){
    num[0] = 1
  }
    for(let i=1; i<num.length; i++){
      result_list.push(num[i]/num[0])
    }
  return result_list
}

// 테스트 케이스 
console.log(divider(2, 39, 4, 7, 28, 62, 28))
console.log(divider(0, 39, 4, 7, 28, 62, 28))