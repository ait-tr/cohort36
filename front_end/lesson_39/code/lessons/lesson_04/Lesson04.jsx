import AnimalCard from '../../components/animalCard/AnimalCard';
import './style.css';
// именной импорт позволяет забрать забрать данные из нескольких экспортов из одного файла
// данные забираем через деструктуризацию {}
import { lionData, zebraData } from './data';
import Button from '../../components/button/Button';

function Lesson04() {
  return (
    <div>
      <h1 className='heading'>Lesson 4: props children</h1>
      <p>
        Когда React видит элемент, представляющий пользовательский компонент, он
        передаёт JSX-атрибуты этому компоненту в виде единственного объекта. Мы
        называем этот объект «props». Props используются для передачи данных от
        родительских компонентов дочерним компонентам. Это один из основных
        механизмов передачи данных в React:
      </p>
      {/* синтаксис props похож на html атрибуты
      имя свойства вы придумываете сами и передаете переменную с данными через фигурные скобки
      */}
      {/* данные со львом */}
      <AnimalCard animalPropsData={lionData} />
      {/* данные с зеброй */}
      <AnimalCard animalPropsData={zebraData} />
      <p>
        Здесь мы два раза вызываем один компонент Button но с разными данными:
      </p>
      <Button buttonText={'first'} isGetButton={true} />
      <Button buttonText={'second'} isGetButton={false} />
    </div>
  );
}

export default Lesson04;
