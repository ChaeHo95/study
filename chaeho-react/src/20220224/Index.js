import '../App.css';
import React, { Component } from 'react';
import Counter2 from './Counter2';
import Dummy from './Dummy'
import Openapi from './Openapi'

class App extends Component {
  
  render(){
   return(
     <>
     <Counter2/>
     <Dummy/>
     <Openapi/>
     </>
   )
  }
}

export default App;