import '../App.css';
import React, { Component } from 'react'

class Loading extends Component {
  state = {
    loading: false,
    isAuthorized: true,
    userId: 'sunrise'
  }
  render(){
    const { loading, isAuthorized, userId } = this.state
    return (
      <>
        {!loading && isAuthorized && userId === 'sunrise' && 
          (
            <div>
              <h1>Home page</h1>
              <h3>This is home</h3>
            </div>
          )
        }
      </>
    )
  }
  
}

export default Loading;