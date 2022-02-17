function Book(name, price, release, authors){
    this.name = name
    this.price = price
    this.release = release
    this.authors = authors

    this.getInfo = function(){
        console.log('----- 책 정보 -----')
        console.log('제목: ', this.name)
        console.log('가격: ', this.price)
        console.log('초판: ', this.release)
        console.log('저자: ', this.authors.join(' '))
    }
}

const book = new Book(
    'javascript',
    21000,
    '2019-12-03',
    ['mark', 'victoria']
)

book.getInfo()