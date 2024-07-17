export default function Lesson07() {
  // * примитивные типы данных из js в ts:

  // 1. String
  // 2. Number
  // 3. Boolean
  // 4. Null
  // 5. Undefined
  // 6. Symbol
  // 7. BigInt

  // сложные типы данных в ts:

  // 1. Object
  // 2. Array
  // 3. Function


  // * 1. Типизация строк
  let user: string = 'Donald';
  user = 'Angela';


  // * 2. Типизация чисел

  let importantNum: number = 42;
  importantNum = 8.5;

  // * 3. Типизация булевого значения

  // пример union type и типизации конкретного значения
  let truth: boolean | 'truth' = true;
  truth = 'truth';

  // * 4. Типизация массива

  let fruits: string[] = ['apple', 'orange', 'lime'];
  fruits[0] = 'banana';
  fruits.push('pear');

  // * 5. Типизация функций без параметра

  // если функция ничего не возвращает - это тип void
  const sayHello = (): void => {
    console.log('hello!');
    // return 'hello'
  };


  // * 6. Типизация функций c параметром

  // типизируем параметры функции в скобках
  // отдельно типизируем возвращенное значение

  const arrUser = (user: string, age: number): [string, number] => {
    return [user, age];
  };


  // * 7. типизация объектов через interface


  interface IUser {
    name: string;
    // если поставить после типа ? - он становится необязательным
    age?: number | string;
    role: string;
  }

  // интерфейсы можно объединять через ключевое слово extends
  interface IFrontendDeveloper extends IUser {
    isFrontendDeveloper: true;
  }

  const userData: IFrontendDeveloper = {
    name: 'Denis',
    age: 40,
    role: 'admin',
    isFrontendDeveloper: true
  };

  // * 7. типизация объектов через type

  type Person = {
    name: string;
    age: number;
  };

  type Employee = Person & { role: string; };

  const driver: Employee = {
    name: 'Hank',
    age: 37,
    role: 'driver'
  };


  // * деструктуризация объекта
  // объявление переменных по именам ключей из объекта и присвоение им соответствующих значений в одну строчку

  const { role, name, age } = userData;
  console.log(role, name, age);
  console.log(arrUser('peter', 30));

  sayHello();

  return (
    <>
      <h1>React TypeScript</h1>
      <p>String: {user}</p>
      <p>{importantNum}</p>
      <p>{truth}</p>
      {fruits.map((el, index) => (
        <p key={index}>{el}</p>
      ))}
      <p>User: {userData.name}</p>
      <p>{driver.name} is {driver.role} 🚛</p>
    </>
  );
}
