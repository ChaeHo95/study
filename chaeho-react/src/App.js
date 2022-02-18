import logo from './logo.svg';
import './App.css';
import Person from './Person';
import Todo from './Todo';
import Animal from './Animal';
import Friend from './Friend';
import Person2 from './Person2';
import Book from './Book';
import Animal2 from './Animal2';
import NameTag from './NameTag';
import Counter from './Counter';
import Counter2 from './Counter2';
import Counter3 from './Counter3';
import Change from './Change';
import Cart from './Cart'
import PhotoGallery from './PhotoGallery';
import CommentFilter from './CommentFilter';


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
        -----------20220218------------
        <NameTag/>
        ------------------------------
        <Counter/>
        <Counter2/>
        <br/>문제 1번
        <Counter3/>
        <br/>문제 2번
        <Change/>
        <br/>문제 3번
        <Cart/>
        <br/>문제 4번
        <PhotoGallery/>
        <br/>문제 5번
        <CommentFilter comment="너는 진짜 못말리는 바보 똥개다"/>
        <CommentFilter comment="임마! 너 그렇게 살지마! 그지 새끼야 !"/>
        <CommentFilter comment="야 씨~ 너 죽을래? 진짜 ! 콱! 마! "/>


      </header>
    </div>
  );
}

export default App;
