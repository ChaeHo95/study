import React from "react";
import logo from "../logo.svg";
import "../App.css";
import Loading from "./Loading";
import ShowUI from "./ShowUl";
import Movie from "./Movie";

function App3() {
  // return React.createElement( // 쓰레기 코드
  //   "div",
  //   { className: "App" },
  //   React.createElement(
  //     "header",
  //     { className: "App-header" },
  //     React.createElement(
  //         "div",
  //         { className: "greeting" },
  //         `Hello`)
  //   )
  // );

  return (
    // JSX문법
    <div className="App">
      <header className="App-header">
        <div className="greeting">Hello</div>
        <Loading />
        <ShowUI />
        <Movie
          id="1234567890"
          title="해리포터"
          language="english"
          release="2013년 7월 19일"
          length="27345"
          author="조앤K롤링"
          production="sunrise"
        ></Movie>

      </header>
    </div>
  );
}

export default App3;
