// * 2차원 배열을 객체들의 배열로 변경하기
const persons = [
    [
        "sunrise",
        23
    ],
    [
        "victoria",
        19
    ],
    [
        "daniel",
        28
    ],
    [
        "ammy",
        21
    ],
    [
        "smith",
        32
    ]
]

for(let i in persons){
    persons[i] = {name: persons[i][0], age: persons[i][1]}
}

console.log(persons)