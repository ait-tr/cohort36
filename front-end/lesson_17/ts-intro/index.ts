console.log("welcome TS");

//Как типизировать?
// Явно vs Неявно

let y: number = 10; // пример явной типизации
let p: string;
p = "Hello";
//
let isDrunk: boolean = true;

// Ключевое слово type
//мы можем объявлять типы отдельно
type Age = number; // типы всегда с большой буквы
let myAge: Age = 29;

let k: number | string;
k = 4;
console.log(k);

let qwerty: any;

// Пример Union type
type Pet = "cat" | "dog";
let petOfAlex: Pet = "cat";
petOfAlex = "dog";

//Можн расширить Union type
type ExtendedPet = Pet | "bird";
let petOfAlex2: ExtendedPet;

type Gender = "male" | "female";
type ExtendedGender = Gender | "non binary person";

// Как типизировать массив стринговых значений

let fruits: string[] = ["apple", "orange", "mango"];
// особенно важно указывать тип ри создании пустого массива
let vegetables: string[] = [];
vegetables.push("potato");
console.log(vegetables);

// Как типизировать объекты

type User = {
  firstName: string;
  isAdmin: boolean;
};

const user1: User = {
    firstName: "Vladimir",
    isAdmin: false,
};

interface Monster {
    name:string,
    height:number,
    isAlive:boolean,
    isEvil:boolean,
}
// Создадим объект указанного типа
const frankenstein: Monster ={
    name: "Frankenstein",
    height: 10,
    isAlive: true,
    isEvil: false,
}
interface ExtendedMonster extends Monster  {
    isFlying:boolean,
}

const dracula: ExtendedMonster ={
    isFlying: true,
    name: "Dracula",
    height: 15,
    isAlive: true,
    isEvil: false
}

// Опциональные поля
interface Food {
    title:string,
    isSweet?:boolean,// ? опциональное поле
}
const pancake: Food = {
    title: "Pancakes",
    isSweet: true,
}
const carrot: Food = {title:"Carrot"} // не ругается из-за отсутствия поля isSweet (?)

console.log(pancake);
console.log(carrot);




