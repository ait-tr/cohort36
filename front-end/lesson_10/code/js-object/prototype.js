// ПРОТОТИПНОЕ НАСЛЕДОВАНИЕ 
//Наследование - это копирование свойств родительского объекта в новый

const bicycle = {
    brand:"Turist",
    price: 3000,
    bell(){
        console.log("Beep")
    }
}
bicycle.bell()

// На основании велосипеда мы сделаем горный велосипед
// указываем прототип с помощью свойства прото(по два подчеркивания с каждой стороны)
const mountineBike = {
    __proto__: bicycle,
    price:450,
    gears: 7
}
console.log(mountineBike.price) // 450
console.log(mountineBike.gears) // 7
console.log(mountineBike.brand) // Turist

// Создайте объект транспортное средство vehicle с полями:
// - speed со значением 40
// - capacity со значением 4
// - метод drive(){} - метод выводит в консоль фразу "Поехали!"

// Создайте на основе vehicle объект jeep с capacity = 5
// скоростью 60 и numbersOfDoors = 2

// Вызовите метод drive от jeep

const  vehicle = {
    speed:40,
    capacity:4,
    drive(){
        console.log("Поехали");
    }
};

const jeep = {
    __proto__:vehicle,
    capacity:5,
    speed:60,
    numbersOfDoors:2
};

jeep.drive()

