// Мы можем скопировать поля -значения из одного объекта в другой
// Spread объекта
const user = {name:"Igor"}
const userWithEmail = {...user, email:"example@gmail.com"};
console.log(userWithEmail);
