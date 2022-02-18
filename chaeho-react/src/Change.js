import logo from './logo.svg';
import './App.css';
import React, { Component } from 'react';

class App extends Component {
  state = {
    title: "변경전 제목",chang: false
  }
  changeTitle = () => {
    if(!this.state.chang){
      this.setState({title: "제목 업데이트",chang:true})
      console.log(this.state)
    }else{
      this.setState({title: "변경전 제목",chang:false})
      console.log(this.state)
    }
  }
  render(){
    const {title} = this.state
    return (
      <div className="App">
        <h1>제목: {title}</h1>
        <button type="button" onClick={this.changeTitle}>change title</button>
      </div>
    )
  }
}

export default App;