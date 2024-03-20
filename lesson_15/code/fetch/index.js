// функция для загрузки данных

function fetchData(){
    fetch ("https://jsonplaceholder.typicode.com/users")
    .then(resp =>{
        if (resp.status !==200 ){
            throw new Error ("Error");
        }
        return resp.json();
    })
    .then(json =>{
        const result = document.getElementById("content");
        result.innerHTML = ""; // очищаем содержимое перед обновлением данных
        const userList = document.createElement("ul")
        json.forEach(user=>{
            const listItem = document.createElement("li")
            listItem.textContent = user.name;
            userList.appendChild(listItem)
        })
        result.appendChild(userList)
    })
    .catch(error =>{
        console.error(error)
    });
}
// повесить обработчик события для кнопки

document.getElementById("updateButton").addEventListener('click',fetchData)