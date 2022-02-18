import React, { Component } from 'react';

class Counter extends Component{
   state = {
    	count: 0
    }
    increase = () => {
    	const {count} = this.state
    	console.log(`before updating state: ${count}`)
    	this.setState({ count: count + 1})
        console.log(`after updating state: ${count}`)
    }
    render(){
    	const {count} = this.state
        console.log(`state in render function: ${count}`)
    	return (
            <>
            	<h1>{count}</h1>
                <button type="button" onClick={this.increase}>increase count</button>
            </>
        )
    }
 }
 export default Counter;