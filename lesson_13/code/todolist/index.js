function addTask() {
  // Получаем значение из текстового поля
  const taskText = document.getElementById("taskInput").value;

  if (taskText.trim() === "") {
    alert("Пожалуйста ,введите текст задачи");
    return;
  }
  // return после вызова alert(),
  //функция завершается с помощью оператора return
  //это предотвращает добавление пустой задачи в список задач
  // и завершает выполнение функции addTask()

  //Создаем новый элемент списка

  const taskItem = document.createElement("li");
  taskItem.innerHTML = `${taskText} <button onClick="removeTask(this)">Удалить</button>`;
  // Это создание кнопки УДАЛИТЬ внутри элемента списка
  //Событие onclick устанавливает обработчик события
  // далее будет вызываться функция removeTask на удаление элемента(листайтема)!!!!!!!
  // передавая текущий элемент кнопки в качестве аргумента, когда кнопка будет нажата

  // добавлем элемент в список задач
  document.getElementById("taskList").appendChild(taskItem);

  // Очищаем текстовое поле

  document.getElementById("taskInput").value = "";
}

function removeTask(button) {
  // Удаляем родительский элемент (li) при клике на кнопку УДАЛИТЬ
  const taskItem = button.parentElement;
  // Эта строка кода получает родительский элемент
  // (элемент-контейнер) кнопки УДАЛИТЬ
  // в данном случае  родительским элементом кнопки
  // является элемент списка задач (<li>)
  // так как кнопка находится внутри элемента списка
  taskItem.remove();
}
