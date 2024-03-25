// МАССИВ  - ДИНАМИЧЕСКИЙ МАССИВ
// ДЛИНА НЕ ФИКСИРОВАНА

//Два способа создания массива

const arr1 = []; // 1 способ
const arr2 = new Array(); // 2 способ

// Как добавить значение по индексу
const fruits = [];
fruits[0] = "apple" // "apple"
fruits[1] = "banana" // "banana"
console.log(fruits)
// Как получить значение по индексу
console.log(fruits[1])
console.log(fruits.length)

// Как создать массив сразу со значениями

const cars = ['Bmw', 'Mercedes', 'Audi', 'Tesla']
console.log(cars)

// Методы работы с массивами

const students =[];
students.push('John'); // добавили справа
students.push('Tom')// добавили справа
students.unshift('Alex') // добавили слева

const vik = students.pop()// pop - удалили элемент с конца массива справа
console.log(students)
console.log(vik)
// shift - удалили элемент слева массива (начало)
const leon = students.shift()
console.log(students)
console.log(leon)


('b' + 'a' + + 'a' +'a').toLowerCase()

