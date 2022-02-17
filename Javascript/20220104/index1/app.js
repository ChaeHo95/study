// 배열요소 추가, 삭제 - push, pop
// [배열].push(추가할 요소)

const seasons = ['spring', 'summer', 'autumn']

const arrLength = seasons.push('winter')

console.log(seasons) //  변경된 원본배열 출력
console.log(arrLength) // 변경된 배열 길이 출력

const multiplyBySix = []

for(let i=1; i<100; i++){
    multiplyBySix.push( 6 * i )
}

console.log(multiplyBySix) //  6의 배수로 이루어진 배열


const movies = ['Haprry potter', 'Doctor stranger', 'Iron man', 'Spider man', 'Widow']
const moviesInfo = []

function addMovieInfo(movie, index){
    moviesInfo.push( {title: movie, id: index} )
}
movies.forEach(addMovieInfo)

console.log(moviesInfo) //  무비 ID 가 추가된 영화 목록 생성

// [배열].push(추가할 요소 1, 추가할 요소 2, 추가할 요소 3, ...)
let cities = ['seoul', 'busan', 'daegu']

cities.push('deajeon', 'ulsan')

console.log(cities)

cities = ['seoul', 'busan', 'daegu']
const citiesToAdd = ['deajeon', 'ulsan']

cities.push(...citiesToAdd)

console.log(cities)