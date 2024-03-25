// 7 типов
// string, bigInt, number, boolean, null, undefined ,symbol

// Преобразование в строку
const str = String(1999); // '1999'
console.log(typeof str);

// Преобразуем в число
const num = Number("7777") // 7777
console.log(typeof num);
const  num2 = Number("1234$%%^") // NaN
console.log(num2);
console.log(typeof NaN)

// Преобразование в булевое значение

const b1 = Boolean(1); // true
const b2 = Boolean(0);// false
const b3 = Boolean(""); // false
const b4 = Boolean(" ");// true
const b5 = Boolean(-1);// true
const b6 = Boolean(null);// false
const b7 = Boolean(undefined);// false
const b8 = Boolean(NaN); // false


console.log([1,2,3]+[4,5,6]);

