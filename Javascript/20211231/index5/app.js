const words = [
    'abc',
    'animal',
    'fruit',
    'abba',
    'abcba',
    'location',
    'radar',
    'madam',
    'mario',
    'level'
]

words.forEach(word => {
    if(word.indexOf('a' > -1)){
        console.log(word)
    }
})