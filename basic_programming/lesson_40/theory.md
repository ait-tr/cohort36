## 01. Ссылки на null
* Иногда такое бывает, что объект отсутствует, но переменная есть.
* Такое может быть с примитивными переменными только в том случае, если они не инициализированы.
* Но с объектами ситуация немного другая. Так как переменные не хранят сами объекты, а лишь ссылки на них, появляется
возможность указать ссылку на ничего.
* Т.е. когда переменная существует и инициализирована, но не хранит никакого объекта.
* Такое значение называется null и, соответственно, обозначается ключевым словом `null`.
* `null` можно присвоить всем переменным у которых тип класса, независимо от того, какой это класс.

* Сравнение ссылки на объект с `null` называется null-check.
* null-check всегда производится с помощью оператора сравнения, а не метода equals.
* Почему так? Потому что (вспоминаем):
  1. метод - это блок кода, привязанный к объекту
  2. `null` - это значение, обозначающее отсутствие объекта
* Это значит, что из переменных, значение которых null нельзя вызывать вообще ничего.
* Другими словами, из null невозможно вызвать метод, потому что null обозначает отсутствие объекта,
а метод всегда должен вызываться только из объекта. Так как объекта нет, то и ничего вызвать нельзя.
* При попытке все таки вызвать метод из null вы всегда будете получать одну из самых популярных 
ошибок в программировании - NPE.
* NPE - Null Pointer Exception - исключительная ситуация, в которой мы пытались что-то сделать с ссылкой на null.

## 02. Методы equals и hashCode
* Метод equals позволяет сравнивать два объекта контролировано.
* Т.е., можно управлять тем, какие объекты будут считаться равными, а какие нет.
* Этот метод очень тесно связан с hashCode.
* Хэш - специальное число, которое будет уникальным для каждого объекта в программе, но при этом должно быть одинаковым
для одинаковых объектов.
* Обычно, для генерации хэша объекта, использую хэши всех его полей.

* При написании метода equals нужно проверить три составляющих на равенство: ссылку, тип и значение.
  * Ссылка - нужно проверить, равняется ли переданная ссылка на объект ссылке на текущий объект. Если да, нет смысла
  проверять дальше - один и тот же объект всегда будет равен сам себе.
  * Тип - нужно проверить тип объекта, сделав попытку нисходящего преобразования. Если преобразование невозможно (типы
  не совпадают), то объекты не равны, потому что объекты разных типов не могут быть равны.
  * Значение - нужно проверить значения полей объекта. Объекты равны только если все соответствующие поля равны.