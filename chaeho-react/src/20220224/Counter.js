import '../App.css';
import React, { Component } from 'react'

class App extends Component{
  state = {
    cnt: 0
  }
  increase = () => {
    this.setState({ cnt: this.state.cnt + 1})
  }
  componentDidUpdate(prevProps, prevState){
    console.log('카운트 업데이트 !')
    console.log('직전 카운트 값: ', prevState)
  }

  render(){
    const { cnt } = this.state

    return (
      <div className='center'>
        <div>{cnt}</div>
        <button onClick={this.increase}>카운트 증가</button>
      </div>
    )
  }
}

export default App;