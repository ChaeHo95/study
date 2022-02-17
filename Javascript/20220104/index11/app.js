const movies = [
    {title: 'Harry Potter', release: '2003-02-22'}, 
    {title: 'Indiana Jhones', release: '2009-01-09'}, 
    {title: 'Terminator', release: '2007-04-11'},
    {title: 'Dracula', release: '2007-04-13'},
    {title: 'Jurassic Park', release: '2007-05-13'},
    {title: 'Iron man', release: '2012-12-18'},
    {title: 'Spider man', release: '2017-03-07'}
]

function number(user1,user2){
    const a = user1.release
    const b = user2.release
    // 자바스크립트에서는 > , < 연산자가 문자열도 비교 가능
    // 내부에서 문자열 하나씩 아스키코드로 비교함 
    if(a > b){return -1}
    if(a < b){return 1}
    return 0
}

movies.sort(number)

console.log(movies)