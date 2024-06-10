import './lesson03.css';
// при импорте вы можете выбрать удобное для вас имя
import MyButton from '../button/Button';

function Lesson03() {
  return (
    <main className="App">
      <h1>Hello, React!</h1>
      <p>first react lesson</p>
      <MyButton />
    </main>
  );
}

export default Lesson03;
