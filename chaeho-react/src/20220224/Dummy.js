import '../App.css';
import { Component } from 'react';

class DummyData extends Component {
  state = {
    word :'english',
    meaning: '영어'
  }
  dummyData = [
    {
        word: 'apple',
        meaning: '사과'
    },
    {
        word: 'before',
        meaning: '이전의'
    },
    {
        word: 'clean',
        meaning: '깨끗한'
    },
    {
        word: 'dummy',
        meaning: '가짜의'
    },
    {
        word: 'emergent',
        meaning: '긴급한'
    },
    {
        word: 'famouse',
        meaning: '유명한'
    },
    {
        word: 'give',
        meaning: '(~을) 주다'
    },
    {
        word: 'humble',
        meaning: '검소한'
    },
    {
        word: 'ingrave',
        meaning: '조각하다'
    },
    {
        word: 'jungle',
        meaning: '밀림숲'
    },
    {
        word: 'korea',
        meaning: '대한민국'
    },
  
]
  increaseCount = () => {
      const rd = this.pickRandomNumber()
      const data = this.dummyData[rd]
      this.setState({word : data.word,meaning:data.meaning})
  }
  pickRandomNumber = () => {
    return Math.floor( Math.random() * this.dummyData.length) 
  }
  componentDidMount(){
    this.countID = setInterval(
      this.increaseCount
    , 1000)
  }
  componentWillUnmount(){
    clearInterval(this.countID)
  }
  render(){
    const { word,meaning } = this.state
    return (
      <div className="App">
        <h1>Automatic Word!</h1>
        <h2>{word}</h2>
        <h2>{meaning}</h2>
      </div>
    );
  }
}

export default DummyData;