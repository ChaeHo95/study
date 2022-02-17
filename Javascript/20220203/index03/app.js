function Book(name, price, release, authors){
    this.name = name
    this.price = price
    this.release = release
    this.authors = authors
}

Book.prototype.getInfo = function(){
    console.log('----- 책 정보 -----')
    console.log('제목: ', this.name)
    console.log('가격: ', this.price)
    console.log('초판: ', this.release)
    console.log('저자: ', this.authors.join(' '))
}

const book = new Book(
    'javascript',
    21000,
    '2019-12-03',
    ['mark', 'victoria']
)

console.dir(Book) // 생성자 함수 출력
console.log(Book.prototype) // 생성자 함수의 프로토타입 객체

book.getInfo()