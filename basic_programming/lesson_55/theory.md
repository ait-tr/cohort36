## 01. Map и Set
* Для начала, разберемся с тем, что такое хеш-таблица
* Хеш-таблица - это структура данных, которая представляет собой массив определенной длинны, хранящий односвязные списки.
* Элементы в хеш-таблицу добавляются по такому алгоритму:
  1. Вычисление хеш-кода элемента с помощью hashCode()
  2. Деление с остатком хеш-кода на размер массива
  3. Запись элемента в ячейку массива по индексу, равному остатку от деления ранее. Если элемент уже там был,
  просто добавляем в список по этому индексу как новый последний элемент
* Получить элемент из хеш-таблицы можно проделав те же действия
* Обратите внимание: в хеш-таблице порядок будет определен остатками от деления хеша элементов на размер массива, поэтому
почти никогда не будет соответствовать хронологическому порядку добавления.

![image](https://raw.githubusercontent.com/ait-tr/cohort36/main/basic_programming/lesson_55/img/1.png)

Небольшой пример хеш-таблицы с несколькими элементами

* Set - множество. Такая коллекция, котора представляет, собственно, множество (в математике).
* Основное свойство множества - уникальность элементов. Т.е., при попытке добавления дубликатов, они не будут добавляться.
* Map - карта(словарь). Такая коллекция, которая хранит элементы в форме ключ-значение.
* В карте вместо индексации используются ключи. При этом ключ может быть любым объектом.
* HashMap для хранения элементов использует хеш-таблицы, а HashSet использует для хранения элементов HashMap

* var - ключевое слово, которое помогает определить тип данных переменной по ее значению

## 02. Лямбда-выражения
* Оказывается, что в ОЗУ сохраняются не только переменные, но и методы.
* Это значит (то что методы тоже лежат в памяти), что на них можно делать ссылки.
* Чтобы получить метод как значение, которое можно записать в переменную, нужно указать имя класса, а потом
оператор разрешения областей видимости (::) (scope resolution operator).
* Это значение будет называться ссылкой на метод (method reference).
* Это значение теперь можно записать в переменную.
* Тип переменной, в которую можно записать эту ссылку будет функциональным интерфейсом
* Функциональный интерфейс - это такой интерфейс, у которого есть всего один не реализованный метод, и он аннотирован
как @FunctionalInterface
* Для методов с разными конфигурациями возврщаемых значений и параметров существуют разные функциональные интерфейсы.
* Например, для методов которые ничего не принимают и ничего не возвращают используется Runnable