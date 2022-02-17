function Book(name, price, release, authors){
    this.name = name
    this.price = price
    this.release = release
    this.authors = authors
}

Book.prototype = {
    getInfo(){
        console.log('----- 책 정보 -----')
        console.log('제목: ', this.name)
        console.log('가격: ', this.price)
        console.log('초판: ', this.release)
        console.log('저자: ', this.authors.join(' '))
    },
    discount(){
        if(this.name === 'python'){
            this.price -= 1000
        }
    },
    get getPrice(){
        return this.price
    },
}

const book1 = new Book(
    'javascript',
    21000,
    '2019-12-03',
    ['mark', 'victoria']
)
const book2 = new Book(
    'python',
    18700,
    '2022-01-07',
    ['syleemomo']
)


book1.discount()
console.log(book1.getPrice)

book2.discount()
console.log(book2.getPrice)