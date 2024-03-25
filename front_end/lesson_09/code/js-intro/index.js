// Примитивные типы данных

// 1. string - является примитивом

let str1 = "можно в двойных"
let str2 = 'можно в одинарных'

let str3 = "13" // это строка
let str4 = str1 + " " + str2
console.log(str4)
console.log(str1.toUpperCase()) // перевод в верхний регистр


// 2. Number

let num1 = 9;
let num2 = 9.6;

// 3. bigInt
let num3 = 1239n;// больший диапозон чем у number


// 4. Boolean

let isDrunk = true;
// условную конструкцию
 if (isDrunk){
    console.log('Ты пьян!')
 }
 const result = isDrunk ? "Ты пьян!" : "Ты не пьян!"

// 5. undefined

let str5;
str5=12;
console.log(str5)

// 6. null
// null - отсутствие значения
// null можно присвоить

let empty = null;
console.log(empty)

// 7. symbol
// Новый тип  используется для создания уникальных значений программы

let s1 = Symbol('something')
console.log(s1);


//ПРЕОБРАЗОВАНИЕ ТИПОВ В JS

// 1. преобразование в строку
// неявное преобразование
let str7 = ""+ 9 // "9"
console.log(typeof str7)

//явное преобразование
const num4 =10;
let str8 = String(num4) // '10'
console.log(typeof str8)

//Пример
const res = 9 + 12 + "5"; // '215'
console.log( typeof res)
const res2 = "5" + 9 + 12; // '5912'
console.log(res2)

// Преобразование в число неявное
const num5 = +"6";//
console.log(typeof num5)
const sum = +"9" + +"10";
console.log( typeof sum)

//Явное преобразование
const num6 = Number('117') // '117'
const num7 = Number('1234&*#')// NaN - not a number появляется в
// результате неудачного преобразования или неудачной математической операции
console.log(typeof num7)
console.log(NaN + 10)


// Преобразование в булевое значение
// число в булевое значение
const res4 = Boolean(9) // TRUE
const res5 = Boolean(0)// FALSE
console.log(res5)
// Преобразование строки  в булевое значение
const res6 = Boolean("")// false
const res7 = Boolean(" ") // true
console.log(res6)
console.log(res7)

const res8 = Boolean(null)
console.log(res8)

const res9 = Boolean(undefined)
console.log(res9)

// Равенство строгое и нестрогое
// == - не строгое
// === - строгое
console.log(9=="9")// true  9ка преобразуется в стринг "9" и тогда он проверяет
// равенство "9" == "9"
console.log(9==="9")// false
console.log(true =="")// false
console.log(true=="1")// true

let n16 = 13 % 2;
console.log(n16)
let n17 = 13** 2;
console.log(n17)
Math.sqrt()
















