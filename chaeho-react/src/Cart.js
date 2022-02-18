import React, { Component } from 'react'

class Cart extends Component{
    state = {
        cart: []
    }

    //구현하기
    addProduct = () => {
        const product = prompt("원하시는 상품을 추가해주세요 !")
        this.setState({cart:[...this.state.cart, product]})
        console.log(this.state)
    }

    // 구현하기
    render(){
        const { cart } = this.state
        return (
            <>
            <br/>
            {cart.map( pr => {
                return <>{pr}<br/></>
                })}
            <button type="button" onClick={this.addProduct}>add Product</button>
            </>
            
        )
    }
}
export default Cart