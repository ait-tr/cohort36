import Button from '../../components/button/Button';
import BrotherHood from './brotherhood/BrotherHood';

const Lesson08 = () => {
  // 1. Generics в TS

  type MyArray<T> = T[];

  const fruits: MyArray<string> = ['apple', 'banana', 'lime'];
  const ages: MyArray<number> = [25, 40, 99];


  function getFirst<T>(arr: T[]): T {
    return arr[0];
  }

  enum Season {
    spring = 'Spring',
    summer = 'Summer',
    winter = 'Spring',
    autumn = 'Autumn'
  }

  const summer = Season.summer;
  console.log(summer);




  getFirst(fruits);
  console.log(ages);








  const consolePush = () => {
    console.log('push!');
  };

  const consoleClick = () => {
    console.log('click!');
  };
  return (
    <div>
      <p>Lesson08</p>
      {/* здесь кнопка покажет push как значение по умолчанию, потому что мы не передали buttonText */}
      <Button isGetButton={true} buttonText={'push!'} onButtonClick={consolePush} />
      <Button onButtonClick={consoleClick} buttonText='click me!' isGetButton={false} />

      <BrotherHood />
    </div>
  );
};

export default Lesson08;
