// Мы можем создавать элементы с нуля и прикреплять их к документу html
// создадим пустой элемент p

const newElement = document.createElement("p");
newElement.textContent = "Я был создан при помощи JS";
newElement.style.border = "2px solid red";
// мы создали элемент,осталось его прикрепить
// мы прикрепили элемент внутрь body
document.body.appendChild(newElement);


const targetElement = document.getElementById("target-element");
const newBtn = document.createElement("button");
// добавить атрибут тип со значением button
newBtn.type = "button";
// добавим текст  "нажми меня"
newBtn.textContent = "Нажми меня";
//прикрепили ее в див
targetElement.append(newBtn);