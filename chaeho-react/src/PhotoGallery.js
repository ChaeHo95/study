import React, { Component } from 'react'

class PhotoGallery extends Component{
    state = {
        photos: []
    }

    //구현하기
    addPhoto = () => {
        const photo = prompt("추가하려는 사진의 경로를 입력해주세요 !")
        this.setState({photos:[...this.state.photos, photo]})
        console.log(this.state)
    }

    // 구현하기
    render(){
        const { photos } = this.state
        return (
            <>
            <br/>
            {photos.map( pr => {
                return <><img src={pr}/></>
                })}
            <button type="button" onClick={this.addPhoto}>add Photo</button>
            </>
            
        )
    }
}
export default PhotoGallery