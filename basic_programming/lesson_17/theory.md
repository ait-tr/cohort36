# 01. Перегрузка методов
* Обычно, в джава нельзя создавать методы с одинаковыми идентификаторами, так как идентификаторы должны быть уникальными.
* Но, все таки можно сделать методы с одинаковыми идентификаторами. Условие для этого - разные параметры.
Это называется "перегрузка".
* Перегрузка метода - это когда мы пишем еще один вариант этого метода, но с другим списком параметров.
* Напоминание: параметры это переменные внутри круглых скобок метода
* При вызове перегруженного метода, список аргументов (значений, которые мы передаем при вызове) будет определять,
какая перегрузка будет вызываться
* Одним из самых ярких примеров перегруженного метода являются print и println
* Перегрузками нельзя считать такие методы, в которых:
1. Различны только идентификаторы параметров
2. Различаются только типы возвращаемого значения
3. Разные идентификаторы методов
* Обратите внимание, что перегруженные методы все равно могут иметь разные типы данных возвращаемого значения
# 02. Практика
* Вспоминаем степени.
* Вознесение числа в какую-то степень n значит умножение этого числа самого на себя n раз.
* Если степень 0, то результат всегда будет 1.
* Если степень отрицательная, то число нужно перевернуть в знаменатель, степень оставить, умножив ее на -1,
а в числителе оставить 1.
