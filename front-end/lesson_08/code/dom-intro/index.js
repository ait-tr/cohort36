console.log("Hello JS") // Вывод в консоль (смотреть можно в браузере или вс код)

// Как создавать переменные в JS?
// let - для объявления переменной
// const - для объявления константы
let x ;
x = "Hello";
x = 5;
console.log(x);

const work = {
    age:12,
    location:USA
}
const newWork = work

// name = "Vladimir"
// console.log(name)

const boxElement = document.getElementById("box-1");
console.log(boxElement)
boxElement.style.backgroundColor = "green" // поменяли цвет бэкграунда
// изменим ширину квадрата
boxElement.style.width = "200px"
// Изменим текст внутри квадрата
boxElement.textContent = "Green box"