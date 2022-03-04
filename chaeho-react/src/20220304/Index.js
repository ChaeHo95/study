import React, { Component } from "react";
import App2 from "./App2";
import App3 from "./App3";
import App4 from "./App4";
import Map from './Map'
class App extends Component{

    render(){
        return(
            <>
                <App2/>
                <App3/>
                <App4/>
                <Map/>
            </>
        )
    }
}
export default App