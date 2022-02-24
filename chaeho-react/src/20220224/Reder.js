import '../App.css';
import React, { Component } from 'react'

class App extends Component{
  state = {
    friends: null
  }
  setFriends = () => {
    this.setState({ friends: [
      "sunrise",
      "vicvoria",
      "hanna"
    ] })
  }

  render(){
    const { friends } = this.state

    if(friends !== null){
      return (
        <>
          <div>{friends.join(' ')}</div>
          <button onClick={this.setFriends}>친구목록 갱신</button>
        </>
      ) 
    }else{
      return null
    }
  }
}

export default App;