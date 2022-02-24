import '../App.css';
import { Component } from 'react';

class App extends Component {
  state = {
    lottoNum : []
  }
  increaseCount = () => {
      this.setState({lottoNum : []})
      for(let i=0; i<6; i++){
        const rdnum = this.pickRandomNumber()
        this.state.lottoNum.includes(rdnum) ? i-- : this.setState({ lottoNum: [...this.state.lottoNum,rdnum]})
    }
  }
  pickRandomNumber = () => {
    return Math.floor( Math.random() * 45) + 1
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
    const { lottoNum } = this.state
    return (
      <div className="App">
        <h1>Automatic Lotto!</h1>
        <h2>{lottoNum.join(" ")}</h2>
      </div>
    );
  }
}

export default App;