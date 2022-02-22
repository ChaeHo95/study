import "../App.css";
import React, { Component } from "react";

class ShowUI extends Component {
  state = {
    count: 0,
  };
  showUI = (cnt) => {
    let ui = null;
    switch (cnt) {
      case 0:
        ui = <h1>Home</h1>;
        break;
      case 1:
        ui = <h1>About</h1>;
        break;
      case 2:
        ui = <h1>Detail</h1>;
        break;
      default:
        ui = <h1>NotFound</h1>;
    }
    return ui;
  };
  increase = () => {
    if (this.state.count > 2) {
      this.setState({ count: 0 });
    } else {
      this.setState({ count: this.state.count + 1 });
    }
  };
  render() {
    const { count } = this.state;
    return (
      <>
        {this.showUI(count)}
        <button type="button" onClick={this.increase}>
          페이지 변경
        </button>
      </>
    );
  }
}

export default ShowUI;
