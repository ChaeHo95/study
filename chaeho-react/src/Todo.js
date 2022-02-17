import React, { Component } from "react";

class Todo extends Component{
    // state 선언 => 데이터 초기화
    constructor(props){
        super(props)
        this.state = {

            //Todo 데이터 정의

            name: 'cleaning',
            done: false,
            description: "cleaning my room in weekends"
        }
    }
    // 이벤트핸들러 함수
    changeTdoName = () =>{
        console.log(this)
        this.setState({
                name: 'leaning javascript'
        })
    }
    render(){
        const{name, done, description} = this.state
        console.log(this.props)
        
        // html 템플릿 (JSX 문법)
        return(
            <>
                <h3>name: {name}</h3>
                <h4>done: {done ? 'finished' : 'ongoing'}</h4>
                <p>description: {description}</p>
                <button type='button' onClick={this.changeTdoName}>이름 변경</button>
            </>
        )
    }
}

export default Todo