import '../App.css';
import React, { Component } from 'react'

class App extends Component{
  componentDidMount(){
    const photoBox = document.querySelector('.photo-box')
    photoBox.innerHTML = "포토 박스"
  }

  render(){
    return (
      <>
        <div className='photo-box'>
          컨텐츠 없음
        </div>
      </>
    ) 
  }
}

export default App;