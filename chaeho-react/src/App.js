import logo from './logo.svg';
import './App.css';
import Person from './Person';
import Todo from './Todo';
import Animal from './Animal';
import Friend from './Friend';
import Person2 from './Person2';
import Book from './Book';
import Animal2 from './Animal2';

const friend =[
  {name: 'victoria', age: 13, city: 'seoul'},
  {name: 'sun', age: 34, city: 'busan'},
  {name: 'johseb', age: 25, city: 'busan'},
  {name: 'syleemomo', age: 9, city: 'seoul'},
  {name: 'hannah', age: 41, city: 'daegu'},
  {name: 'shara', age: 37, city: 'seoul'},
  {name: 'martin', age: 28, city: 'daegu'},
  {name: 'gorgia', age: 39, city: 'seoul'},
  {name: 'nana', age: 24, city: 'busan'},
  {name: 'dannel', age: 19, city: 'seoul'},
  ]

const animal = {
  type: 'cat',
  name: 'meyow',
  size: 'small',
  sound: 'low',
  appearence: 'cute'
}
function App() {
  return (
    <div className="App">
      <header className="App-header">
        Hello world!
        <Person/>
        ------------------------------
        <Todo user='chaeho'/>
        ------------------------------
        <Animal/>
        ------------------------------
        <br/>문제 1번
        {friend.map(friend => {
          return <Friend name={friend.name} age={friend.age} city={friend.city}/>
        })}
        <br/>문제 2번
        <Person2/>
        ------------------------------
        <br/>문제 3번
        <Book/>
        <br/>문제 4번
        <Animal2 {...animal}/>


      </header>
    </div>
  );
}

export default App;
