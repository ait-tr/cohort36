
//Задан массив
const cars = [
    { brand: "BMW", price: 20000, isDiesel: true },
    { brand: "Mercedes", price: 22000, isDiesel: false },
    { brand: "Porshe", price: 50000, isDiesel: true },
    { brand: "Nissan", price: 25000, isDiesel: false },
];

//Задание 1 - создать на основе страрого массива новый массив объектов: 
const autos = cars.map(car => ({...car}));
console.log(autos);

//Задание 2 -  новый массив, машины с дизельным двигателем
const autosDisel = autos.filter((auto) => auto.isDiesel == true);
console.log(autosDisel);

//Задание 3 - новый массив, машины не с дизельным двигателем.
const autosNotDisel = autos.filter((auto) => auto.isDiesel !== true);
console.log(autosNotDisel);

//Задание 4 - общая стоимость всех машин не с дизельным двигателем.
const autosNotDiselPrice = autosNotDisel
    .map((auto) => auto.price)
    .reduce((acc, price) => acc + price, 0);
console.log(autosNotDiselPrice);

//Задание 5 - повысьте цену всех машин в массиве на 20%.
autos.forEach((auto) => auto.price *= 1.2);
console.log(autos);

//Задание 6 - новый массив, где все дизельные машины заменены на "Tesla"
const autosWithTesla = autos
    .filter((auto) => auto.isDiesel == true)
    .map((auto) => {
        auto.brand = "Tesla",
        auto.price = 25000,
        auto.isDiesel = false
    });
console.log(autos);
