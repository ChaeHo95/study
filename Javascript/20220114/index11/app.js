// * 2차원 배열을 1차원 배열로 변환하는 방법
let _1dArray = []

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

for(let person of persons){
    _1dArray = _1dArray.concat(person)
}

console.log(_1dArray)