import React from "react";
import logo from "../logo.svg";
import "../App.css";
class User extends React.Component {
  state = {
    users: [
      { name: "victoria", age: 13, city: "seoul", email: "victoria@gmail.com" },
      { name: "sun", age: 34, city: "busan", email: "sun@gmail.com" },
      { name: "johseb", age: 25, city: "busan", email: "johseb@gmail" }, // 탈락
      {name: "syleemomo",age: 9.23,city: "seoul",email: "syleemomo@nate.com"}, // 탈락
      { name: "hannah", age: 41, city: "daegu", email: "hannah0923*gmail.com" }, // 탈락
      { name: "shara", age: 37, city: "seoul", email: "shara@gmail.com" },
      { name: "martin", age: -34, city: "daegu", email: "martin@gmail.com" }, // 탈락
      { name: "gorgia", age: 39, city: "seoul", email: "gorgia@gmail.com" },
      { name: "nana", age: 24, city: "busan", email: "nana@gmail.com" },
      { name: "dannel", age: 19, city: "seoul", email: "dannel@gmail.com" },
    ],
  };
  control = (user, id) => {
    if (this.email_control(user) && this.age_control(user)) {
      return (
        <div key={id}>
          <p>
            {user.name}({user.age})
          </p>
          <p>{user.city}</p>
          <p>{user.email}</p>
          <br />
        </div>
      );
    } else {
      return (
        <div key={id}>
          <p>잘못된 정보</p>
        </div>
      );
    }
  };
  email_control = (user) => {
    const reg_email =
      /^([0-9a-zA-Z_\.-]+)@([0-9a-zA-Z_-]+)(\.[0-9a-zA-Z_-]+){1,2}$/;
    if (!reg_email.test(user.email)) {
      return false;
    } else {
      return true;
    }
  };
  age_control = (user) => {
    if (!Number.isInteger(user.age) || user.age < 0) {
      return false;
    } else {
      return true;
    }
  };
  render() {
    const { users } = this.state;

    return (
      <>
        <div className="App">
          <header className="App-header">
            <div className="greeting">Hello</div>
            {users.map((user, id) => {
              return this.control(user, id);
            })}
          </header>
        </div>
      </>
    );
  }
}
export default User;
