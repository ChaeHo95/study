function rd(min, max){
    return Math.floor( Math.random() * (max-min+1) ) + min 
}

function Tester(A,B,C,D,E){
    this.A = A
    this.B = B
    this.C = C
    this.D = D
    this.E = E  
    this.F = 0
}
Tester.prototype = { 
    get getInfo(){
        return this.F 
    },
    qualitysleep(){
        this.F = this.E/(this.A*this.B*this.C*this.D)
    }
}

let tester_Group = []

 for(let i=0; i<3; i++){
    let test = []
    for(let j=0; j<100; j++){
        const tester = new Tester(
            rd(1,10),
            rd(1,10),
            rd(1,5),
            rd(1,10),
            rd(0,50)
        )
        test.push(tester)
    }
    tester_Group.push(test)
 }
 console.log(tester_Group)
 
 for(let index in tester_Group){
    let count = 0    
    tester_Group[index].forEach(element => {        
        element.qualitysleep()
        if(0.37 <= element.getInfo && 50 >= element.getInfo){
            count++
        }
     })
     tester_Group[index] = count   
 }
 console.log(tester_Group)
 
 let max = 0
 tester_Group.forEach(element => {
    if(element > max){
        max = element
    }
 })

 function abc(num){
    const a = String.fromCharCode('a'.charCodeAt(0)+num)
    return a
 }
 
 let num = 0
 for(let test of tester_Group){ 
    if(test == max){
        alert(`수면도가 높은 그룹은 ${abc(num).toUpperCase()} 입니다`)
        break
     }
     num++ 
 }
