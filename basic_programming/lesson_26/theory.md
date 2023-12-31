## 01. Конструкторы
* Конструктор - это специальный метод, который используется для создания объекта.
* Конструктор не имеет возвращаемого типа данных.
* Конструкторы делятся на конструкторы по умолчанию и конструкторы с параметрами.
* Идентификатор любого конструктора всегда будет таким же, как и идентификатор класса.

### 01.1. Конфликты имен в методах класса
* Иногда, если вы назвете параметр метода также как поле класса, произойдет "конфликт имен".
* Конфликт имен - это такая ошибка, при которой компилятор не понимает, какой именно идентификатор нужно использовать.
* Такие конфликты, которые приводят к ошибке компиляции - довольно очевидны. Их решения - тоже.
* Эти конфликты называют переопределением.
* Но иногда возникают конфликты имен, которые никак не мешают компиляции. Такие конфликты будут называться перекрытием.
* Перекрытие - это такой конфликт имен, когда более локальный идентификатор перекрывает более глобальный.
* Перекрытие не всегда будет вызывать ошибку компиляции.

* Перекрытие в методах класса, когда параметр имеет такой же идентификатор как и поле этого класса можно исправить
указав в нужном месте принадлежность идентификатора к текущему объекту, из которого вызывается метод.
* Получить ссылку на текущий объект (т.е. тот, из которого вызывается метод) можно с помощью ключевого слова `this`

* Конструктор с параметрами - это специальный метод для создания объекта, в который можно передать аргументы с начальными
значениями для полей объекта.
* В конструкторе с параметрами не обязательно должны быть параметры для каждого поля.
* Конструктор с параметрами может иметь перегрузки.
* Рекомендуется записывать параметры конструктора в том же порядке, что и поля.

* Конструктор по умолчанию - это такой конструктор, у которого нет параметров.
* Обычно, в таком конструкторе инициализируют поля какими-то значениями по умолчанию

* Также, из одних конструкторов можно вызывать другие конструкторы.
* Делается это, опять, с помощью слова `this`
* В одном конструторе можно вызвать другой конструктор только один раз.
* Вызов другого конструктора всегда должен быть первой инструкцией в конструкторе

* Полезная информация: Структура класса
  * Сначала записываются все поля
  * Потом, конструктор по умолчанию
  * Потом все остальные конструкторы
  * Потом, методы класса
  * В конце, аксесоры
* Последние два пункта можно поменять (по желанию)

## 02. Статический контекст
* При работе внутри класса существует два контекста работы - объектный и статический.
* Объектный контекст - это когда все методы и поля вызываются из объекта.
* Статический контекст (static context) - это когда не существует объекта, из которого вызывается метод, вместо этого
метод вызывается напрямую из класса.
* Объектный и статический контекст не дружат между собой - в статическом контексте нельзя использовать все из объектного,
и наоборот.
* Но справедливо это только внутри одного класса.
* Это значит, что в статическом контексте можно создавать объекты других классов, и при этом, в объектном контексте можно
вызывать статические методы/поля других классов.
* Обратите внимание, что до этой недели мы всегда работали в статическом контексте
* У всех статических методов и полей всегда будет модификатор `static`
* Переход из одного контекста в другой в границах одного файла - возможен.
* Чтобы перейти из статического в объектный, нужно просто создать внутри статического метода объект текущего класса.
* Перейти из объектного в статический намного проще - нужно просто вызвать нужный метод.
## 02. Константы
* Константа - это значение, которое нельзя изменять.
* В коде, константы будут представлены переменными, которые будут иметь специальный модификатор `final`
* Просто переменные с таким модификатором будут локальными константами.
* Истинные константы обычно являются статическими полями.
* Для того чтобы переменная считалась обычной константой, она должна быть полем, и
перед ней нужно написать комбинацию `public static final`