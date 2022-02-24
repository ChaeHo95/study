import '../App.css';
import React, { Component } from 'react';

class App extends Component {
  constructor(props){
    console.log('constructor')
    super(props)
    this.state = {
      name: "syleemomo"
    }
  }
  changeName = () => {
    this.setState({name: "name changed"})
  }
  componentDidMount(){
    console.log('mount')
    console.log('----------')
  }
  componentDidUpdate(){
    console.log('update')
  }
  componentWillUnmount(){
    console.log('unmount')
  }
  
  render(){
    console.log('render')
    const {name} = this.state
    return (
      <div className="App">
        <h1>{name}</h1>
        <button onClick={this.changeName}>Change name</button>
      </div>
    )
  }
}

export default App;