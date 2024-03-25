// SPREAD оператор
//Примитивные и ссылочные типы

const fruits = ["apple", "orange", "mango"]
const fruits2 = fruits
fruits[0] = "banana";
console.log(fruits);
console.log(fruits2);


// При работе с примитивными типами - в переменной мы храним значение
let str1 = "hello";
let str2 = str1;
str1 = "Goodbye";
console.log(str1)
console.log(str2);

// Как скопировать элементы массива в новый массив
const cars = ["Lada", "BMW", "Audi"]
// spread оператор ...
const carsCopy = [...cars];
// Если мы мутируем  второй массив ,то первый не измениться
carsCopy[0] = "Opel";
console.log(cars);
console.log(carsCopy);

// Как объединить два массива в третий с помощью  spread ...

const cities1 = ["Berlin", "Paris"];
const cities2 = ["London", "Budapest"]

const joinedCities = [...cities1, ...cities2];
console.log(joinedCities);

// Мы можем создать массив и добавить в него элемент

const vegitables =["cucumber", "tomato"];
const newVegitables = [...vegitables, "carrot"];
console.log(newVegitables);

// Метод Splice()

// Этот метод изменяет содержимое массива
// удаляя или заменяя существующие элементы 
// const myArray =[1,2,3,4,5];
// myArray.splice(0,2) ; // удаляем два элемента начиная с индекса 0
// console.log(myArray);


// Добавление элементов
// const myArray = [1,2,3,4,5];
// myArray.splice(2, 0, 'a', 'b')// Вставляем элементы 'a' и 'b' начиная с индекса 2
// console.log(myArray);


// Метод Slice()

const myArray = [1,2,3,4,5];
const newArray = myArray.slice(2) ; // Создаем новый массив ,начиная с элемента с индексом 2
console.log(newArray);
console.log(myArray);
// Этот метод возвращает новый массив,
// содержащий копию части исходного массива,
// определенной  начальным и конечным индексами (не включая конечный)





