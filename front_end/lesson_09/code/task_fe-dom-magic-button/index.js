// Найдем первую кнопку по id
const btn = document.getElementById("magic-btn")
// скопируем ее - получилась вторая кнопка.Ее можно использовать
const cloneBtn = btn.cloneNode(true)
cloneBtn.id = "magic-btn-2"

btn.addEventListener('click', ()=>{
    // при нажатии на первую кнопку
    cloneBtn.textContent = "Я изменю тебя";
    cloneBtn.style.backgroundColor ='#a78b71';
    cloneBtn.style.color = 'white' ;
    // cloneBtn.className = 'second-btn'
    cloneBtn.classList.add('second-btn')
    document.body.append(cloneBtn)

})

let toggle = true;
cloneBtn.addEventListener('click', ()=>{
    if (toggle){
        btn.style.backgroundColor = '#9c4a1a';
        btn.style.color = "black"
    } else{
        btn.style.backgroundColor = "#f7c815"
        btn.style.color = "white"
    }
    toggle = !toggle;
})
