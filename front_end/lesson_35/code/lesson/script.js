const productList = document.querySelector('#productList');

// создаем асинхронную функцию
async function getProducts() {
  // кладем в переменную результат fetch запроса
  const res = await fetch('https://fakestoreapi.com/products');
  // обрабатываем данный в json
  const data = await res.json();
  // итерируемся по элементам массива
  data.map(product => {

    // создаем контейнер
    const productCard = document.createElement('div');
    // добавили класс карточке
    productCard.classList.add('productCard')
    // создаем заголовок
    const cardTitle = document.createElement('h4')
    // добавляем заголовку текст
    cardTitle.textContent = product.title
    // создаем картинку
    const cardImage = document.createElement('img')
    // добавляем адрес картинке
    cardImage.src = product.image
    // добавляем класс картинке
    cardImage.classList.add('cardImage')
    // добавляем заголовок и картинку карточке
    productCard.append(cardTitle, cardImage)
    // добавляем карточку на страницу
    productList.append(productCard)
  });
}

// не забываем вызвать функцию
getProducts();
