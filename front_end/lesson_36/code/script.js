const productList = document.querySelector('#productList');
const formItems = document.querySelector('#formItems');
const loader = document.querySelector('#loader');

// заводим слушатель событий на элемент
formItems.addEventListener('submit', e => {
  // предотвращаем поведение формы по умолчанию
  e.preventDefault();
  // забираем значение из формы
  const amount = e.target.amount.value;
  // чистим форму
  e.target.amount.value = '';
  // очищаем контейнер с карточками от предыдущего запросы
  while (productList.firstChild) {
    productList.removeChild(productList.firstChild);
  }
  // включаем loader до отправки данных
  loader.classList.toggle('loader-hide');
  // имитируем поведение сервера с помощью setTimeout()
  setTimeout(() => {
    getProducts(amount);
  }, 1000);
});

async function getProducts(amount_products) {
  // добавляем параметр в get запрос
  const res = await fetch(
    `https://fakestoreapi.com/products?limit=${amount_products}`
  );
  const data = await res.json();
  // прячем loader после того, как данные получены
  loader.classList.toggle('loader-hide');
  data.map(product => {
    const productCard = document.createElement('div');
    productCard.classList.add('productCard');
    const cardTitle = document.createElement('h4');
    cardTitle.textContent = product.title;
    const cardImage = document.createElement('img');
    cardImage.src = product.image;
    cardImage.classList.add('cardImage');
    productCard.append(cardTitle, cardImage);
    productList.append(productCard);
  });
}
