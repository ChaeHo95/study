function Tester(hairColors, hairTypes, glasses ,heights ,weights) {
  this.hairColors = hairColors
  this.hairTypes = hairTypes
  this.glasses = glasses
  this.heights = heights
  this.weights = weights
}
function rd(min, max){
  return Math.floor( Math.random() * ((max-1)-min+1) ) + min 
}

const hairColors = ['black', 'brown', 'yellow', 'white', 'gold']
const hairTypes = ['curly', 'straight', 'wavy', 'coily']
const glasses = [true, false]
const heights = [150, 160, 170, 180, 190, 200]
const weights = [10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150]

const persons = []

for(let i=0; i<1000; i++){
  const person = new Tester(
    hairColors[rd(0,hairColors.length)],
    hairTypes[rd(0,hairTypes.length)],
    glasses[rd(0,glasses.length)],
    heights[rd(0,heights.length)],
    weights[rd(0,weights.length)]
  )
  persons.push(person)  
}

console.log(persons)

const categorys = [hairColors, hairTypes, glasses, heights, weights]
const person_category = ['hairColors','hairTypes','glasses','heights','weights']

const count_value = {}

persons.forEach(person =>{
  let num = 0
  categorys.forEach(cate => {

    for(let category of cate){
      if(person[`${person_category[num]}`] == category){

        if(count_value[`${person_category[num]}_${category}`] == null){
          count_value[`${person_category[num]}_${category}`] = 1
        }
        else{
        count_value[`${person_category[num]}_${category}`] = count_value[`${person_category[num]}_${category}`] + 1
        }
        break
      }
    }
    num++
  })
})
console.log(count_value)

const divs = document.createElement('div')
divs.className = 'values'

for(let index in count_value){
  const div = document.createElement('div')
  div.className = 'value'
  div.innerHTML = `<h2>${count_value[index]}</h2>
  <h5>${index}</h5>
  `
  divs.appendChild(div)
}

document.body.appendChild(divs)