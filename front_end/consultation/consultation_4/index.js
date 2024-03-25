// Пример 1
 const boy = {
    name:"Ivan",
    age: 18
 }
// key, value - ключ значение 
// получили значение по ключу 

console.log(boy.name) // Ivan
console.log(boy.job)// undefined

// как записать новое значение по ключу ?
boy.name = "Vladimir";
console.log(boy.name)
// если такого ключа не было 
boy.job ="journalist";
console.log(boy)
delete boy.age;
delete boy.name;
delete boy.job;



//Пример 2 Свойства из нескольких слов
const user ={name:"Semen", age:35, "cat name":"Murzik"}
console.log(user["cat name"])
//Создать новое свойство из двух слов
user["land of birth"] = "Cyprus";

// Пример 3 как удалить свойство у объкта
console.log(user);
delete user.age;// удалит из объекта соответствующее свойство
console.log(user);

// Пример 4 
const cat  = {name:"Markiza", color:"grey"}
const key1 = "color";
//как по ключу сохраненному в переменной достать значение из объекта
console.log(cat.key1); // undefined
console.log(cat[key1]) // grey
console.log(cat.color)  // grey

// Пример 5 
// у нас есть переменные и мы хотим создать из них объект

const brand = "Nokia";
const price = 200;
// создадим объект
const phone = {brand, price}
console.log(phone);

// Пример 6 
//Как создать объект на основании переменных,
//но сохранить под другими ключами
const bestPrice28 = 400;
const input = "Sony"
const tv = {brand:input, price:bestPrice28}
console.log(tv);

// Пример 7 метод внутри объекта

const bear = {
    name:"Paddington",
    age:45,
    bark(){
        console.log("Grrrrrr")
    },
    fetchToy(){
        console.log("Toy");
    }
}
// Вызов метода 
bear.bark();// 

//====================================================
// 

let arr = [1, 2, 3, "four", "five"];
console.log(arr)

// Метод push() меняет исходный массив,добавляя элементы в конец
// и возвращает новую длину массива
let res = arr.push(6, 7, 8)
console.log(res);
console.log(arr);

//Метод pop()
res = arr.pop()
// распечатываем обновленный массив
console.log(arr);
console.log(res)


//Метод shift() меняет исходный массив,удаляет первый элемент массива
res = arr.shift();
console.log(arr)

//Метод unshift() меняет исходный массив, добавляя элементы в начало массива
res = arr.unshift(0, 1);
console.log(arr);

// Метод concat() не меняет оригинал массива и возвращает новый объединенный массив
let arr1 =[1, 2, 3];
let arr2 =[4, 5, 6];
res= arr1.concat(arr2)
console.log(res);
console.log(arr1);
console.log(arr2)

fruits = ["apple","mango", "banana"]
newfruits = [...fruits, "avocado", "orange"]
console.log(newfruits)
console.log(fruits)

let arr3 
arr4=[]















