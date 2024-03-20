const formElement = document.getElementById("todo-form");
const listElement = document.getElementById("todo-list");

const tasks = [];

const addTask = (event)=>{
    event.preventDefault();
    // event.target - это вся наша форма
    // event.target.title - это наш инпут <input type="text" name="title" placeholder="title" required >
    // event.target.title.value -  это то что пользователь ввел в инпут

    // Получаем информацию из инпутов:
    const title = event.target.title.value;
    const description = event.target.description.value;

    // Очищаем поля:
    event.target.title.value = ""
    event.target.description.value = ""

// Добавим в массив новую задачу

tasks.push({title, description, done:false});
console.log(tasks);
// Отображаем в html коде
renderTasks()
}

function renderTasks(){
    while(listElement.hasChildNodes()){
        listElement.firstChild.remove();
    }

    // Добавим детей
    tasks.forEach((task)=>{
        const li = document.createElement("li"); // создали <li></li>
        const checkBox = document.createElement("input"); // <input>
        checkBox.type ="checkbox";
        checkBox.checked = task.done; // этот атрибут отвечает за то что есть галочка внутри инпута - 
        // true -есть
        checkBox.onclick =() =>{
            // меняем статус в массиве на противоположный
            task.done = !task.done
        };
        li.append(checkBox); // <li> <input type ="checkbox"> </li>
        const textNode = document.createTextNode(
            `${task.title} ${task.description}`
        )
        li.append(textNode)
        console.log(li)
        listElement.append(li)
    })

}
formElement.addEventListener("submit", addTask)
