# Задание

* Совмещение `Main04` и `Main06`
* На вход подается последовательность целых положительных чисел
* Последовательность оканчивается числом -1
* Нужно вывести сумму всех чисел, у которых сумма цифр - четное число

```
515
118
2329
110
1358
611
32
-1

3168
```

* Как решать?

* У каждого числа мы берем сумму цифр

```
515 -> 11
118 -> 10
2329 -> 16
110 -> 2
1358 -> 17
611 -> 8
32 -> 5
```

* Посмотрим, какие суммы цифр - четные

```
515 -> 11
118 -> 10 - ЧЕТНОЕ
2329 -> 16 - ЧЕТНОЕ
110 -> 2 - ЧЕТНОЕ
1358 -> 17
611 -> 8 - ЧЕТНОЕ
32 -> 5
```

* Получается, берем числа 118, 2329, 110, 611 и складываем - 3168