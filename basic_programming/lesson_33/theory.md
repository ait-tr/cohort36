## 01. Методы
* Метод - это функция, которая привязана к объекту и вызывается только из него.
* Функция - это блок кода, который можно выполнить вызвав его, и в который можно передать вводные данные и получить какой-то результат.
* Функции можно вызывать сколько угодно раз.
* Статический метод - что-то среднее между методом и функцией. Он может вызываться без объекта, но при этом все равно
записывается внутри класса.
* Чтобы вызвать метод, нужно написать его идентификатор и оператор вызова метода - круглые скобки
```
    // пример вызова метода
    printHello();
```

* У методов всегда есть возвращаемый тип данных. Он записывается прямо перед идентификатором метода.
* Если метод не возвращает ничего, мы записываем void вместо типа данных.
```
void printHello() {
    System.out.println("Hello!");
}
```
* Если же метод возвращает какое-то значение, мы записываем тип этого значения.
* Для того чтобы внутри метода вернуть значение, пишем слово `return`, и после него значение, которое хотим вернуть.
* Куда же возвращается значение? Возвращается оно туда, где мы вызвали этот метод, и при этом значение будет
считаться результатом выражения вызова метода, и это значение можно будет записать в переменную соответствующего типа.
* Когда выполняется `return` метод заканчивается и код этого метода дальше не выполняется.
```
int getNumber() {
    return 5;
}
```
* И потом можно его использовать:
```
int num = getNumber();
```
* Довольно логично, что вернуть из метода можно только одно значение

* Также в методы можно передавать вводные данные. Но делать это можно только с теми методами, в которых описано, какие
вводные данные они должны получить.
* Вводные данные обозначаются параметрами, т.е. простыми переменными, которые написаны в круглых скобках.
* Параметры должны обязательно быть инициализированы во время вызова метода.
```
void printSum(int a, int b) {
    System.out.println(a + b);
}
```
* Вызвать этот метод можно вот так:
```
printSum(4, 6); // в результате выведется 10 в консоль
```
* Параметров может быть сколько угодно, но не рекомендуется делать слишком много.
* Параметры могут быть любого типа.
* Параметры в списке разделены запятыми
* При вызове метода, значения которыми будут инициализированы параметры называют аргументами.
* Аргумент может быть как другой переменной, так и литералом.
* Аргументы обязательно должны быть таких же типов данных как и параметры, а также написаны в таком же порядке.

* Параметры и переменные, созданные в методах, видимы только внутри этих методов.
* Это справедливо не только для методов, но и для операторов управления потоком программы.
* Это называется область видимости переменных: переменные видны только внутри фигурных скобок блока кода, в котором они 
созданы, и после окончания блока кода, переменные исчезают.

* Рекурсия (в программировании) - это когда функция/метод вызывают сами себя.
* Используется это довольно редко. Одним из случаев испрользования рекурсии будет случай, когда нужно выполнить один и тот же метод
* над элементами внутри элементов.

## Полезно
* Медиана и среднее значение - две разных характеристики.
* Среднее значение - это сумма всех значений разделенная на их количество.
* Обычно среднее значение подходит для определения усредненного значения выборки данных, а иногда не подходит.
* Бывает это очень часто, а именно когда выборка неравномерная
* Медиана (mean) - центр выборки из сортированных данных. Будет более точно отображать усредненное значение, если в 
выборке есть какие-то экстремальные значения