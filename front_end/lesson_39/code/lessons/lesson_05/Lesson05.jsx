import CountArray from '../../components/countArray/CountArray';
import Counter from '../../components/counter/Counter';

function Lesson05() {
  // хук useState() - это особая функция в react, которая помогает нам работать с данными.
  // Мы передаем в нее начальное состояние для переменной - в ответ получаем массив с этой переменной и функцию для ее изменения

  return (
    <div>
      <h3 style={{ marginLeft: '10px' }}>lesson 05</h3>
      <Counter />
      <CountArray />
    </div>
  );
}

export default Lesson05;
