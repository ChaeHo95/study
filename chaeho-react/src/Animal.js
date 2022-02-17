import React from "react";

class Animal extends React.Component{
    // 데이터 초기화
    state = {
        type: 'cat',
        name: 'meyow',
        size: 'smal',
        sound: 'low',
        appearence: 'cute'
    }
    // JSX 문법 => HTML 템플릿

    render(){
    const { type, name, size, sound, appearence } = this.state  
    return (
    	<>
            <h1>동물 정보</h1>
            <h3>종류 - {type}</h3>
            <h3>이름 - {name}</h3>
            <h3>크기 - {size}</h3>
            <h3>소리 - {sound}</h3>
            <h3>생김새 - {appearence}</h3>
        </>
        )
    }
}

export default Animal