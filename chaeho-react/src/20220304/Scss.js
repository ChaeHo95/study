import { Component } from 'react';
import './App.scss'

function App(){
  return (
    <div className='background'>

      <div className='photo-box'>
        <div className='photo'>
          <img src="https://via.placeholder.com/300"/>
        </div>
        <div className='name red'>사진 이름 1</div>
      </div>

      <div className='photo-box'>
        <div className='photo'>
          <img src="https://via.placeholder.com/300"/>
        </div>
        <div className='name blue'>사진 이름 2</div>
      </div>

      <div className='photo-box'>
        <div className='photo'>
          <img src="https://via.placeholder.com/300"/>
        </div>
        <div className='name yellow'>사진 이름 3</div>
      </div>
    </div>
  )
}
export default App