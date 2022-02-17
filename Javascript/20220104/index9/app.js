const friends = [
    {name: 'victoria', age: 13, city: 'seoul'},
    {name: 'sun', age: 34, city: 'busan'},
    {name: 'johseb', age: 25, city: 'busan'},
    {name: 'syleemomo', age: 9, city: 'seoul'},
    {name: 'hannah', age: 41, city: 'daegu'},
    {name: 'shara', age: 37, city: 'seoul'},
    {name: 'martin', age: 28, city: 'daegu'},
    {name: 'gorgia', age: 39, city: 'seoul'},
    {name: 'nana', age: 24, city: 'busan'},
    {name: 'dannel', age: 19, city: 'seoul'},
]
// 한자리씩 밀리면서 들어가면서 비교

function number(a,b){
    const aAge = a.age
    const bAge = b.age
    if(aAge > bAge){return 1}
    if(aAge < bAge){return -1}
    return 0
}

friends.sort(number)

let count = 0;

friends.forEach(friend => {
    if(friend.age < 30){
        count++
    }
})

friends.splice(count,friends.length - count)

console.log(friends)