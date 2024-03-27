interface Airplane {
numberOfEngines:number;
isJet:boolean;
maxHeight:number;
capacity:number;
}

const airBus310: Airplane ={
    numberOfEngines: 4,
    isJet: false,
    maxHeight: 11_000,
    capacity: 100
}

// Создать интерфейс город City
//  со следующими свойствами:
//  name
//  population
// riversName - опциональное поле названия реки
// isCapital - опциональное поле является ли город столицей
// isTouristic - опциональное поле является ли город туристическим
// Создайте  объктов для этого интерфейса
// Дополнительно сделайте интерфейс расширяющий город
//  со следующими свойствами: добавить дату основания


// Типизация функции
//Нужно типизировать параметры и возвращаемое значение

function sum(a:number, b:number):number{
    return a+b
}
const dev = (a:number, b:number)=> a/b;
console.log(sum(10,12));
console.log(dev(20,2));

