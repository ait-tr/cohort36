const paragraphElement = document.getElementById("text");
const changeButtonElement = document.getElementById("btn-change");
const flowerElement = document.getElementById("flowers");
const changeFlowerButtonElement = document.getElementById("btn-change-flower");
const pandaImageElement = document.getElementById("panda");
const pandaButtonElement = document.getElementById("add-panda");
// Всегда проверяйте  получилось ли отловить элемент путем вывода в консоль

// Добавляем слушатель событий (событие, колбек функция)

changeButtonElement.addEventListener("click", ()=>{
    //код внутри этого блока выполняется только при клике на кнопку
    paragraphElement.style.color = "lightcoral";
});

changeFlowerButtonElement.addEventListener('click', ()=>{
    flowerElement.textContent = "Ягодки"
})

pandaButtonElement.addEventListener('click', ()=>{
    pandaImageElement.src = "https://w.forfun.com/fetch/e1/e1dc787a7cd7f60c1b8e266487b559f9.jpeg"
    // pandaImageElement.style.width = "100%"
} )