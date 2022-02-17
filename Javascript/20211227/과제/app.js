// 1번
const num = new Array(100).fill(0)

for (let i = 0; i < num.length; i++) {
    if ((i + 1) % 3 == 0) {
        console.log('a')
        num[i] = i + 1
    }

}
console.log(num)

// 2번
const alphabet = []

const len = Math.abs('z'.charCodeAt(0) + 1 - 'a'.charCodeAt(0))

for (let i = 0; i < len; i++) {
    if (i == 0) {
        alphabet[i] = String.fromCharCode(i + 'a'.charCodeAt(0))

    } else {
        alphabet[i] = alphabet[i - 1] + String.fromCharCode(i + 'a'.charCodeAt(0))
    }
}

console.log(alphabet)

// 3번
const numb = new Array()
let count = 0
let nums = 0

while (count < 100) {

    if ((count + 1) % 3 == 0) {
        numb[nums] = count + 1
        nums++
    }
    count++
}

console.log(numb)

// 4번
for (let i = 0; i < len; i++) {
    alphabet[i] = String.fromCharCode(i + 'a'.charCodeAt(0))
}

function randomStr(n) {
    const array = new Array(n)

    for (let i = 0; i < array.length; i++) {
        const n = Math.floor(Math.random() * array.length)
        array[i] = alphabet[n]
        for (let j = 0; j < i; j++) {
            if (array[j] === array[i]) {
                i--
            }
        }
    }
    return array
}

console.log(randomStr(3))
console.log(randomStr(5))
console.log(randomStr(7))

// 5번

count = 0
nums = 0

for (let numbs in numb) {
    if (numb[numbs] % 6 == 0) {
        numb[numbs] = null
    }
}
console.log(numb)

// 6번

const movies = [
    { title: 'Harry Potter', release: '2003-02-22' },
    { title: 'Indiana Jhones', release: '2009-01-09' },
    { title: 'Jurassic Park', release: '2007-04-13' },
    { title: 'Iron man', release: '2012-12-18' },
    { title: 'Spider man', release: '2017-03-07' }
]

const movies_copied = []

for (let movie in movies) {
    movies_copied[movie] = { title: movies[movie].title, release: movies[movie].release }
}


movies[1].title = 'syleemomo' // 원본배열 변경

console.log(movies)
console.log(movies_copied)

// 7번 

function isPalindrome(word) {
        let word_count = 0;
        for (let i = 0; i < word.length/2; i++) {
            if (word.charCodeAt(i) == word.charCodeAt(word.length - (i + 1))) {
                word_count++
            }
        }
        if (word_count >= word.length/2) {
            console.log(word)
            return true
        }
        return false
}

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

count = 0

for (let wordc of words) {
    if (isPalindrome(wordc)) {
        count++;
    }
}

console.log(count)

