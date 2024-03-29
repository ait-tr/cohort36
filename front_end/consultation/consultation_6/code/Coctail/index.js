function getRandomCoctail(){
    fetch("https://www.thecocktaildb.com/api/json/v1/1/random.php")
    .then(responce=>responce.json())
    // после того как запрос завершится,используется метод then
    // чтобы обработать полученный ответ (responce) responce.json() обрабатываем ответ как JSON
    // и возвращает новый промис , который содержит объект JS с данными
    .then(data=>{
        // данные из ответа доступны в этой функции обратного вызова(callback)
        //переменная data содержит объект с данными случайного коктейля
        const coctail = data.drinks[0]
        // Здесь мы извлекаем данные о первом коктейле из массива коктейлей
        // в объект data data.drinks содержит массив коктейлей и мы берем первый элемент [0]
        const coctailName = coctail.strDrink;
        const coctailImage = coctail.strDrinkThumb;
        const coctailInstructions = coctail.strInstructions;

        document.getElementById("coctail-image").src = coctailImage;
        document.getElementById("coctail-description").textContent = `Название ${coctailName}. Описание: ${coctailInstructions}`
    })
    .catch(error =>{
        console.log("Произошла ошибка при загрузке коктейля", error);
    });
}
getRandomCoctail()