// * 객체들의 배열을 2차원 배열로 변경하기
const persons = [
    {name: 'sunrise', age: 23},
    {name: 'victoria', age: 19},
    {name: 'daniel', age: 28},
    {name: 'ammy', age: 21},
    {name: 'smith', age: 32},
]

for(let i in persons){
    persons[i] = [persons[i]['name'], persons[i]['age']]
}

console.log(persons)