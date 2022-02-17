function initCount(){
    let _cnt = 0
    function _updateCount(diff){
        _cnt += diff
    }
    return {
        increaseCount(){
            _updateCount(1)
        },
        decreaseCount(){
            _updateCount(-1)
        },
        get cnt(){
            return _cnt
        }
    }
}

const counter1 = initCount() // 클로저 (독립적인 실행환경) 생성
const counter2 = initCount() // 클로저 (독립적인 실행환경) 생성
const counter3 = initCount() // 클로저 (독립적인 실행환경) 생성

counter1.increaseCount()
console.log(counter1.cnt) // 1

counter2.increaseCount()
counter2.increaseCount()
counter2.increaseCount()
counter2.decreaseCount()
console.log(counter2.cnt) // 2

counter3.decreaseCount()
counter3.decreaseCount()
counter3.decreaseCount()
counter3.decreaseCount()
counter3.increaseCount()
console.log(counter3.cnt) // -3