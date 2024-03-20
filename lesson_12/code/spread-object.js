//Повторим spread массива
const fruits =["apple", "banana", "mango"]
const newFruits = [...fruits,"carrot"]
console.log(newFruits);

// Повторим spread объекта
const fruit ={
    title:"apple",
    color:"red",
    weight:200
}
console.log(fruit);

const specialOrange = {
    ...fruit, country:"Maroco"
}
console.log(specialOrange);
//Скопируем Apple и заменим цвет
const specialApple = {
    ...fruit, color:"Green"
}
console.log(specialApple);