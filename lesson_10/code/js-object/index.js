// Пример 1 - создание объекта 
const student = {
    age: 22,
    name:'Василий'
}
console.log(student.age) // 22
console.log(student.name) // Василий

// Пример 2 - ключ может состоять из двух слов
// Если ключ имеет пробелы -его нужно обернуть в кавычки

const product = {
    title: 'iphone',
    price: 2000,
    "model of phone" : "XR"
}
//Получить значение по ключу
console.log(product.price);
console.log(product["model of phone"]);

// Положить значение по ключу
product.diagonal = 4.7;
product["type of adapter"] = "USB-C"
console.log(product)

// Пример 3
// Если у нас есть переменная и мы хотим доставать
// значение из объекта по этой переменной

let key = "age";
console.log(student[key]);
key ="name";
console.log(student[key])

const client = {
    firsnName: "John",
    wife: "Maria"
};
const key1 ="wife"
// Как достать по переменной из объекта
console.log(client.key1);
console.log([key1]);

// Пример 4 
// Допустим у нас были переменные и мы хотим создать из них объект

const title = "Titanic";
const capacity = 1500;

const titanic = {title, capacity}
console.log(titanic);

// Пример 5 

const name1 = "Avrora";
const cap = 300;
// хочу создать объект из этих переменных,но с другими названиями ключей
const avrora ={title:name1, capacity:cap}
console.log(avrora);

// Пример 6
// Метод внутри объекта

const dog = {
    nick:"Tuzik",
    bark(){
        console.log("Гав")
    }
};
// вызов метода
dog.bark();








