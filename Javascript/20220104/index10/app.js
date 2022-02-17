const friends = [
    {name: 'victoria', age: 13, city: 'seoul'},
    {name: 'suny', age: 34, city: 'busan'},
    {name: 'johseb', age: 25, city: 'busan'},
    {name: 'suna', age: 9, city: 'seoul'},
    {name: 'hannah', age: 41, city: 'daegu'},
    {name: 'shara', age: 37, city: 'seoul'},
    {name: 'martin', age: 28, city: 'daegu'},
    {name: 'gorgia', age: 39, city: 'seoul'},
    {name: 'nana', age: 24, city: 'busan'},
    {name: 'dannel', age: 19, city: 'seoul'},
]

function number(user1,user2){
    const a = user1.name
    const b = user2.name
    // 자바스크립트에서는 > , < 연산자가 문자열도 비교 가능
    // 내부에서 문자열 하나씩 아스키코드로 비교함 
    if(a > b){return 1}
    if(a < b){return -1}
    return 0
}

friends.sort(number)

console.log(friends)