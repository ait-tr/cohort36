## 01. Полиморфизм
* Полиморфизм (динамический полиморфизм) - последний принцип ООП, говорит о том, что одни и те же методы могут
иметь разную реализацию в разных классах.
* Полиморфизм очень связан с наследованием. Без наследования полиморфизм просто невозможен.
* При полиморфизме, мы для начала делаем восходящее преобразование, т.е. записываем объект дочернего класса
в ссылку родительского класса. Потом, вызываем из него метод.
* Если сделать это с одним базовым классом, но двумя разными дочерними классами, получится так, что мы
пытаемся вызвать один и тот же метод, но результат выходит разный.
* Это и есть полиморфизм.

* Если при переопределении метода в дочернем классе есть надобность вызвать метод, определенный в 
родительском, то для этого используется слово super, после которого через точку вызывается нужный метод.

## 02. Абстрактные классы
* Абстрактный класс - это такой класс, который может иметь методы, у которых отсутствует реализация.
* Но при этом, объекты такого класса создавать нельзя. Следовательно, конструктор должен быть защищенным.
## 03. Интерфейсы
* Интерфейс - это что-то на подобии абстрактного класса, только в нем нельзя создавать поля, только определять методы.
* Интерфейс обычно обозначает не объект, а возможное свойство либо возможность выполнять какое-то действие другим объектом.
