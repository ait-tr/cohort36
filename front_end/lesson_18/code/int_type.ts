// ПРИМЕР ИСПОЛЬЗОВАНИЯ ИНТЕРФЕЙСА

// Интерфейс для определения структуры объекта
interface Person{
    name:string;
    age:number;
}
// Функция принимающая объект с определенной структурой

function greet(person: Person){
    return `Hello, ${person.name}! You are ${person.age} years old.`;
}
const user: Person = {name:"Alice", age:34 };
console.log(greet(user));

// ===================================================

//ПРИМЕР ИСПОЛЬЗОВАНИЯ TYPE

type AgeGroup = "child"|"teenager"|"adult";

// Функция для определения возрастной группы на основе возраста

function getAgeGroup(age:number):AgeGroup {
if (age<18){
    return "child"
} else if (age<30){
    return "teenager"
} else{
    return "adult"
}
}
const age:number = 25;

const userAgeGroup :AgeGroup = getAgeGroup(age);


console.log(`User is in the ${userAgeGroup} age group`);
