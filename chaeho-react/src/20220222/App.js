import '../App.css';
import React, { Component } from 'react'
import logo from "../logo.svg";
import App2 from './App2';
class App extends Component {
  state = {
    friends: [
      {name: 'victoria', age: 13, city: 'seoul'},
      {name: 'sun', age: 34, city: 'busan'},
      {name: 'johseb', age: 25, city: 'busan'},
      {name: 'syleemomo', age: 9, city: 'seoul'},
      {name: 'hannah', age: 41, city: 'daegu'},
      {name: 'shara', age: 37, city: 'seoul'},
      {name: 'martin', age: 28, city: 'daegu'},
      {name: 'gorgia', age: 39, city: 'seoul'},
      {name: 'nana', age: 24, city: 'busan'},
      {name: 'dannel', age: 19, city: 'seoul'},
    ],
    updatedFriends: null
  }
  // 구현하기
  filterCity = (city) => {  
    this.setState({updatedFriends:this.state.friends.filter(friend => friend.city === city)})

  }

  // 구현하기
  render(){
    let { friends, updatedFriends } = this.state
    // || 만약 앞의 값이 참이면 앞의 값을 참조
    updatedFriends = updatedFriends || friends
    return (
      <>
        <div className="App">
          <header className="App-header">
            <div className="greeting">Hello</div>
            <button onClick={() => this.filterCity("seoul")}>서울</button>
            <button onClick={() => this.filterCity("busan")}>부산</button>
            <button onClick={() => this.filterCity("daegu")}>대구</button>
            {updatedFriends.map((friend, id) => {
              return (
                <div key ={id}>
                  이름:{friend.name} 나이:{friend.age} 지역:{friend.city}
                </div>
              );
            })}
            <App2/>
          </header>
        </div>
      </>
    ); 
  }
}

export default App;