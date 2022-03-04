import '../App.css';
import React, { Component } from 'react'

class App extends Component{
  state = {
    todos: []
  }
  componentDidMount(){
    const API_URL = 'http://localhost:5000/api/todos' 
    // 서버에서 데이터 가져오기
    fetch(API_URL)
    .then((res) => {
        return res.json()
    })
    .then((data) => {
      this.setState({todos: data.todos})
    })
  }
  
  render(){
    const { todos } = this.state
    console.log(todos)
    
    return (
      <>
        <div className='App'>
          {todos.length !== 0 && todos.map( todo => {
            return (
              <div key={todo._id}>
                <h1>{todo.name} ({todo.done ? "종료" : "진행중"})</h1>
                <h2>{todo.description}</h2>
                <h2>-------------------------------</h2>
              </div>
            )
          })}
        </div>
      </>
    )
  }
}

export default App;