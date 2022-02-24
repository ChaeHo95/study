import './Colors.css';
import React, { Component } from 'react'

const colors = ["red", "blue", "green", "orange", "skyblue"]

class App extends Component{
  state = {
    colorIndex: 0
  }
  changeColor = () => {
    this.setState({colorIndex: this.state.colorIndex + 1})
  }
  componentDidMount(){
    this.timerId = setInterval(this.changeColor, 1000)
  }
  componentWillUnmount(){
    clearInterval(this.timerId)
  }

  render(){
    const { colorIndex } = this.state
    const color = colors[colorIndex % colors.length]

    return (
      <div className={`color-box ${color}`}>
        {color}
      </div>
    ) 
  }
}

export default App;