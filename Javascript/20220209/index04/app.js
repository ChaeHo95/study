function increaseCount(cnt){
    return ++cnt
}

let cnt1 = 0
let cnt2 = 0
let cnt3 = 0

cnt1 = increaseCount(cnt1)

cnt2 = increaseCount(cnt2)
cnt2 = increaseCount(cnt2)

cnt3 = increaseCount(cnt3)
cnt3 = increaseCount(cnt3)
cnt3 = increaseCount(cnt3)

console.log(cnt1)
console.log(cnt2)
console.log(cnt3)