// countDuplication 함수 구현하기 
function countDuplication(...strs){
    const count = 0
    const count_list = []    
    console.log(strs)
    strs.forEach(element => {
        if(element in count_list){
            count_list[element]++
        }
        else{
            count_list[element] = count
        }
    });
    return count_list
}


// 테스트 케이스 
console.log(countDuplication('cat', 'apple', 'cat', 'tiger', 'cat', 'water', 'computer', 'cat', 'lion', 'pear', 'cat')) // 4

