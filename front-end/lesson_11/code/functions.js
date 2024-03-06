//ФУНКЦИИ В JS
// Function Declaration
//Декларация функции (объявление)

function sum(a,b){
    return a + b;
}
//Вызов функции
let result = sum(50, 30)
console.log(result);

// Если нет ретерна ,что вернет функция - undefined
function print(){
    console.log("Hello");
    return "World"
}
let res2 = print();
console.log(res2)

// FUNCTION EXPRESSION
const divide = function(a,b){
    return a/b
}
// Вызов функции
console.log(divide(10,2));

// Какая разница между Function Declaration и FUNCTION EXPRESSION?
// в Function Declaration  вызов функции может находиться до объявления

print2();

function print2(){
    console.log("PRINT-2");
}