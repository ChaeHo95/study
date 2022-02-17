import React from "react";

function Animal2(props){

    return (
    	<>
            <h1>동물 정보</h1>
            <h3>종류 - {props.type}</h3>
            <h3>이름 - {props.name}</h3>
            <h3>크기 - {props.size}</h3>
            <h3>소리 - {props.sound}</h3>
            <h3>생김새 - {props.appearence}</h3>
        </>
        )
}

export default Animal2