import '../App.css';
import React, { Component } from 'react'

class App extends Component{
  constructor(props){ // 이부분 안쓰면 외부에서 못 불러옴
    super(props)
    this.state = {
      color: "red"
    }
    this.changeColor = this.changeColor.bind(this)

  }
  changeColor(){
    this.setState({ color: this.props.name})
  }

  render(){
    const { color } = this.state

    return (
      <>
        <div>{color}</div>
        <button onClick={this.changeColor}>색상 변경</button>
      </>
    ) 
  }
}

export default App;