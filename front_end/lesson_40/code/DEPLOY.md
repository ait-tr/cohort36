### deploy приложения на git pages

1. Ставим в зависимости git pages:

npm i gh-pages

2. Инициализируем git и размешаем на github.

3. Добавьте в package.json:

{
  "homepage": ".",
  "scripts": {

    "deploy": "npm run build && gh-pages -d build"
  },

}

4. Делаем deploy:

npm run deploy

5. После выполнения дз присылайте 2 ссылки:

- ссылка на репозиторий с веткой main с react файлами
- ссылка на деплой из git pages


