###

### задание


1.  Сделайте форму для отправки pass и username с помощью formik в новом компоненте
2.  Данные должны отправиться на api `https://dummyjson.com/docs/users`
3.  Api ждет post запрос - его синтаксис есть в документации.


```js
fetch('https://dummyjson.com/user/login', {
  method: 'POST',
  headers: { 'Content-Type': 'application/json' },
  body: JSON.stringify({
    username: 'emilys',
    password: 'emilyspass'
  })
});
```

- выведите результат на странице (имя, email, картинка)


