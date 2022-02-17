const animals = ['cat', 'lion', 'turtle', 'dog', 'pig']
const fruits = ['apple', 'banana', 'strawberry', 'pineapple', 'pear']

function searchItemInCategory(category, key){
    return category.filter(item => item === key)[0]
}

console.log(searchItemInCategory(animals, 'turtle')) 
// searchItemInCategory 내부의 category 변수에는 접근하지는 못하지만
// 외부인자에 의하여 수정이 가능함
console.log(searchItemInCategory(animals, 'pig'))
console.log(searchItemInCategory(animals, 'banana'))

console.log(searchItemInCategory(fruits, 'strawberry'))
console.log(searchItemInCategory(fruits, 'apple'))
console.log(searchItemInCategory(fruits, 'lion'))


console.log('--------------------')
// -------------------------------------

function searchItemInCategory2(category){
    function text_filter(key){
        return category.filter(item => item === key)[0]
    }
    return text_filter
}

const animals_test = searchItemInCategory2(animals)
const fruits_test = searchItemInCategory2(fruits)

console.log(animals_test('turtle'))
console.log(animals_test('pig'))
console.log(animals_test('banana'))

console.log(fruits_test('strawberry'))
console.log(fruits_test('apple'))
console.log(fruits_test('lion'))