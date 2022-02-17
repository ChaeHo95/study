import React from "react";

class Friend extends React.Component{

    constructor(props){ // 데이터를 받아서 객체로 만들어주는 과정
        super(props)
        console.log(props)
    }
    render(){ // HTML태그 생성
        const {name, age, city} = this.props
        return(
        <>
            <p>name: {name} </p>
            <p>age: {age}</p>
            <p>city: {city}</p>
            ------------------------------
        </>
        )
    }
    
}
export default Friend