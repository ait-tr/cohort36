class Animals{
    constructor(age, name, color){
        this.age = age;
        this.name = name;
        this.color = color;
    }
    info(){
        console.log(`Меня зовут ${this.name} Возраст: ${this.age} Цвет: ${this.color}`)
    }
}
const panda =  new Animals(14, "Po" , "black")
panda.info();

// Наследование 
// Создадим производный класс птица -
// добавим поле полета heightOfFlight и ration - рацион

class Bird extends Animals{
    constructor (age, name, color, heightOfFlight, ration){
        super(age, name, color);
        this.heightOfFlight = heightOfFlight;
        this.ration = ration;
    }
}
const colibri = new Bird(14, "Po", "black", 100, "flowers");
console.log(colibri)

// Создайте класс Alcohol с полями:
// - title
// - strength - крепость
// - volume - объекм бутылки
//  с методом info - выводт в консоль фразу
//  "Ни дня без <название алкоголя>" | "Надо и меру знать"

// Создайте производный класс Brendy
// - age - выдержка
// - country - страна производства

// Создайте производный класс Liquor
// - sugarAmount - количество сахара

class Alcohol{
    constructor(title, strength, volume){
        this.title = title;
        this.strength = strength;
        this.volume = volume;
    }
    info(){
        console.log(`Ни дня без  ${this.title}`);
    }
}

class Brendy extends Alcohol{
    constructor(title, strength, volume, age, country){
        super(title, strength, volume);
        this.age = age;
        this.country = country;
    }
}

class Liquor extends Alcohol{
    constructor(title, strength, volume, sugarAmount){
        super(title, strength, volume);
        this.sugarAmount = sugarAmount;
    }
}

const ararat = new Brendy("Ararat", 40, 0.7, 5, "Armenia");
const bellis = new Liquor("Bellis", 20, 0.7, 3);

console.log(ararat);
console.log(bellis);

ararat.info()
bellis.info()


