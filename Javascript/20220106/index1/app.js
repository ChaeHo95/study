// [배열].slice(부분배열을 추출할 인덱스 시작점, 부분배열을 추출할 인덱스 끝점)

let words = ['car', 'paper', 'mobile', 'computer', 'school', 'sun', 'house']

let slicedWords = words.slice(3)

console.log(slicedWords)

words = ['car', 'paper', 'mobile', 'computer', 'school', 'sun', 'house']

slicedWords = words.slice(2, 4)

console.log(slicedWords)

words = ['car', 'paper', 'mobile', 'computer', 'school', 'sun', 'house']

slicedWords = words.slice(-4, -1)

console.log(slicedWords)


const movies = [
    {title: 'Harry Potter', release: '2003-02-22'}, 
    {title: 'Indiana Jhones', release: '2009-01-09'}, 
    {title: 'Jurassic Park', release: '2007-04-13'},
    {title: 'Iron man', release: '2012-12-18'},
    {title: 'Spider man', release: '2017-03-07'}
]

slicedWords = movies.slice(1, 3) // 부분배열 추출

movies[1].title = 'syleemomo' // 원본배열에서 배열요소(객체)의 프로퍼티 변경

console.log(movies)
console.log(slicedWords)