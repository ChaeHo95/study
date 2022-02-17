// [새로운 배열] = [배열 1].concat(배열 2)

// 배열의 concat 메서드는 배열 1과 배열 2의 배열요소들을 하나로 합쳐서 새로운 배열을 반환
let words = ['car', 'mobile', 'sun', 'foot', 'pen']
let numbers = [1, 2, 3]

let unitedArr = words.concat(numbers)

console.log(unitedArr)

// concat 메서드를 사용하는 대신 스프레드 연산자(...)를 이용하여 새로운 배열에 각 배열의 요소들을 풀어헤쳐서 복사
words = ['car', 'mobile', 'sun', 'foot', 'pen']
numbers = [1, 2, 3]

unitedArr = [...words, ...numbers]

console.log(unitedArr)

// 문자열을 배열로 변경하기

let sentence = 'I joined swimming club in my highschool'
let splitedSentence = sentence.split()
// 빈 문자열이므로 빈 문자열을 하나의 요소로 가진 배열을 반환
console.log(splitedSentence)

sentence = 'I joined swimming club in my highschool'
splitedSentence = sentence.split()
// 구분문자를 설정하지 않았기 때문에 sentence 문장 전체를 요소로 가진 배열을 반환
console.log(splitedSentence)


sentence = 'I joined swimming club in my highschool'
splitedSentence = sentence.split('')
//  구분문자를 빈 문자열, sentence 문장을 문자 하나씩 잘라서 배열로 반환
console.log(splitedSentence)

sentence = 'I (joined) swimming <club> in my highschool'
splitedSentence = sentence.split(/[()<>]/)
// 구분문자에는 정규표현식을 설정할 수 있음
// 대괄호 안에 구분문자를 여러개 설정하면 해당 구분문자들 중 어느 하나이면 문자열을 잘라줌
console.log(splitedSentence)

//배열의 split 메서드는 두번째 인자를 설정할 수 있음
sentence = 'I joined swimming club in my highschool'
splitedSentence = sentence.split(' ', 3)
console.log(splitedSentence)

// 배열의 split 메서드에는 구분문자로 배열을 사용할 수 있음
// 배열요소들이 콤마로 구분된 하나의 문자열로 변경된다. 즉, 위 코드에서 구분문자는 결국 ^,^ 이 된다.
sentence = 'I^,^joined^,^swimming^,^club^,^in^,^my^,^highschool'
splitedSentence = sentence.split(['^', '^'])
console.log(splitedSentence)

// 배열과 문자열 메서드를 함께 사용하기 - split, join 
// 배열의 split 메서드는 join 메서드와 함께 사용할 수 있음
// sentence 문자열을 문자 하나씩 잘라낸 배열로 만든 
// 다음 reverse 메서드로 뒤짚고 join 메서드로 다시 하나로 합침
sentence = '?죠밌재 트립크스바자'
splitedSentence = sentence.split('').reverse().join('')
console.log(splitedSentence)

// 함수 체이닝을 사용하여 split, map, join 메서드를 연쇄적으로 실행
// sentence 문자열에서 club 이 들어가는 단어 옆에 수영을 의미하는 아이콘을 추가하는 코드
//  map 메서드는 반드시 return 이 필요
const sentence = 'I joined swimming club in my highschool. that club was awsome !'
const modifiedSentence = sentence.
                        split(' ')
                        .map(word => {
                            return word = word === 'club' ? `${word} 🏊` : word
                        })
                        .join(' ')
console.log(modifiedSentence)