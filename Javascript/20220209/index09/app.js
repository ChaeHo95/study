function initCount(){
    let _cnt = 0 // 프라이빗 변수
    function _updateCount(diff){
        _cnt += diff
    }
    return {
        increaseCount(){
            _updateCount(1) // 프라이빗 함수
        },
        decreaseCount(){
            _updateCount(-1) // 프라이빗 함수
        },
        get cnt(){
            return _cnt
        }
    }
}