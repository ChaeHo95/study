import React from 'react';

class Person2 extends React.Component {
  state = { 
      name: "sunrise",
      age: 23,
      friends: [
          "victoria",
          "daniel",
          "hanna"
      ]
  }
  displayInfo = () =>{
    alert(
        `
        이름: ${this.state.name}\n
        나이: ${this.state.age}\n
        친구: ${this.state.friends.map(fr =>{
            console.log(fr)
            return fr+" "
        })}
        `)
  }
  render() {    
    return (
    	<>
            <button onClick={this.displayInfo}>신상정보 확인하기</button>
        </>
    )
  }
}

export default Person2;