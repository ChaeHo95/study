const book = {
    name: 'javascript',
    price: 21000,
    release: '2019-12-03',
    authors: ['mark', 'victoria'],
    getInfo: function(){
        console.log('----- 책 정보 -----')
        console.log('제목: ', this.name)
        console.log('가격: ', this.price)
        console.log('초판: ', this.release)
        console.log('저자: ', this.authors.join(' '))
    }
}

book.getInfo()