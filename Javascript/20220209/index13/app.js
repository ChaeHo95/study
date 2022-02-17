const comment = '너는 진짜 못말리는 바보 똥개 그지다 !'
const insults = ['바보', '똥개', '그지']

function separateStr(str, delimeter){
    return str.split(delimeter)    
}

function filterKeyword(arr, keyword){
    return arr.filter(word => !word.includes(keyword))
}

let strSeparated = separateStr(comment, ' ')

for(let insult of insults){
    strSeparated = filterKeyword(strSeparated, insult)
}

console.log(strSeparated)

//----------------------------------

function separateStr2(str, delimeter){
    let strSeparated2 = str.split(delimeter)
    
        function filterKeyword2(keyword){
            strSeparated2 = strSeparated2.filter(word => !word.includes(keyword))
            return strSeparated2
    }
    return filterKeyword2
}



const copy_text = separateStr2(comment,' ')

let text = ''

for(let insult of insults){
    text = copy_text(insult)
}
console.log(text)
