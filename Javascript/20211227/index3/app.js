// 배열 요소 CRUD (배열요소 생성, 배열요소 조회, 배열요소 변경, 배열요소 삭제)

const movies = []

movies[0] = 'Harry Potter'
movies[1] = 'Indiana Jhones'
movies[2] = 'Jurassic Park'
movies[3] = 'Iron man'
movies[4] = 'Spider man'

console.log('/* My Favorite Movie List */')
for(let i=0; i<movies.length; i++){
    console.log(movies[i])
}
console.log('*****************************')

// for ~ in 문을 사용하는 방법이다.
// for ~ in 문으로 조회하는 값은 배열의 인덱스 값

console.log('/* My Favorite Movie List */')
for(let index in movies){
    console.log(movies[index])
}
console.log('*****************************')

// for ~ of 문을 사용하는 방법이다.
// for ~ of 문으로 조회하는 값은 배열 각각의 요소

console.log('/* My Favorite Movie List */')
for(let movie of movies){
    console.log(movie)
}
console.log('*****************************')

// 배열의 특정요소를 변경하는 방법은 
// 변경하고자 하는 배열요소의 인덱스 값을 이용

movies[2] = 'Terminator'
console.log(movies)

// 특정 배열요소를 삭제하려면 delete 키워드를 사용

delete movies[2]
console.log(movies)


