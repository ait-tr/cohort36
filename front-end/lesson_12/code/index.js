 const brothers = [
    {race:"hobbit", height: 110, age:45, name: "Frodo Baggins"},
    {race:"human", height: 185, age:46, name: "Aragorn"},
    {race:"elf", height: 189, age:110, name: "Legolas"},
    {race:"dworf", height: 140, age:150, name: "Gimly"},
    {race:"human", height: 195, age:200, name: "Gandalf"},
 ];
// Метод Map - возвращает новый массив
// не изменяя старый массив

// Пример 1
const names = brothers.map((element)=>element.name);
console.log(names); // [ 'Frodo Baggins', 'Aragorn', 'Legolas', 'Gimly', 'Gandalf' ]

// Пример 2 
const ages = brothers.map((brother)=>brother.age);
console.log(ages);// [ 45, 46, 110, 150, 200 ]

// Пример 3 
const racesNames = brothers.map((brother)=>brother.race + " " + brother.name);
console.log(racesNames);

// Пример 4 
// высокий - выше или равно 170
// маленький - ниже 170
// массив из слов [маленький, высокий,высокий, маленький,высокий]

const sizes = brothers.map((brother)=>{
    if (brother.height >=170){
        return "высокий";
    }
    return "маленький"
});
console.log(sizes);

const sizesVer2 = brothers.map((brother)=>brother.height >=170 ? "высокий" : "маленький");
console.log(sizesVer2);

// Метод forEach - для изменения исходного массива

// Пример 1 
// Состарим всех героев на 1 год

brothers.forEach((brother)=>{
    brother.age +=1
    // brother.height -=1
});
console.log(brothers);

// пример 2
// переведем все имена в верхний регистр

brothers.forEach((brother)=>brother.name = brother.name.toUpperCase());
console.log(brothers);

// Метод reduce 
// с помощью цикла for
let sum = 0;
for(let i = 0; i<ages.length; i++){
    sum+= ages[i];
}
console.log(sum); // 551

// метод reduce

const sum2 = ages.reduce((acc, curent)=> acc+curent,0);
console.log(sum2)
// iteration  -- acc -- curent
 //1          -- 0   -- 45
 //1          -- 45  -- 46
 //1          -- 91  -- 110
 //1         -- 201  -- 150
 //1         -- 351  -- 200

 // Аккумулятор  - значение
 // которое накапливает результат применения функции
 // Теккущий элемент массива (curentValue)
 // Текущий индекс (curentIndex) элемента в массиве
 // Сам массив (array),к котрому применяетсмя метод reduce
 // Функция callback  должна возвращать новое значение аккумулятора
 // после обработки текущего элемента


 // Общая высота наших героев
 const totalHeight = brothers.reduce((acc,brother)=> acc + brother.height,0)
 console.log(totalHeight); //819

//комбинация map+reduce
 const totalHeight2 = brothers
.map((brother)=>brother.height) // получили массив ростов
.reduce((acc, height)=> acc+height, 0);
console.log(totalHeight2); // 819

// хотим объединить все имена через пробел
const nameStr = brothers
.map((brother)=>brother.name) // получили массив имен
.reduce((acc, name)=> acc+name + " "," ")
console.log(nameStr);

// .trim - убирает пробелы

// Метод Split разделяет строку на массив
const str = "Gandalf, Sauron, Saruman, Legolas, Elrond";
const namesArr = str.split(", ")// метод сплит принимает разделитель
console.log(namesArr) // [ 'Gandalf', 'Sauron', 'Saruman', 'Legolas', 'Elrond' ]

// Метод join
const newString = namesArr.join("!")
console.log(newString); //Gandalf!Sauron!Saruman!Legolas!Elrond

// Метод find  - возвращает первое совпадение с заданным условием
const person = brothers.find((brother)=> brother.race === "human");
console.log(person);// { race: 'human', height: 185, age: 47, name: 'ARAGORN' }

const person2 = brothers.find((brother)=>brother.name === "ARAGORN");
console.log(person2);

// Метод Filter
// Возвращает все элементы удовлетворяющие  условию
// НЕ МУТИРУЮЩИЙ массив (не изменяет исходный массив)

const oldBrothers = brothers.filter((brother)=>brother.age >100);
console.log(oldBrothers);

// выбрать всех старых ,но не human

const oldNoNHumans = brothers
.filter((brother)=>brother.age >100 && brother.race !== "human" );
console.log(oldNoNHumans);
