###

1. Заберите из старого проекта из Lesson_06 логику для отображения карточек в новый компонент BrotherHood в папке сегодняшнего урока (в отдельной папке и не забудьте добавить стили) и перенесите логику в него
2. Заберите data.js и перенесите ее в сегодняшний урок с расширением ts. Типизируйте
3. Заберите BrotherCard и положите в components, измените его расширение на TSX и добавьте типизацию.
4. Отобразите через map() в BrotherHood и BrotherCards в компоненте домашней работы.

###

Подсказка!

Чтобы узнать тип переменных с данными - наведите мышкой на переменную, в которым содержатся данные. Это отлично работает для сложны данных из библиотек, например функции сеттера из хука useState().

у setBrothers, например, при наведении мышкой будет виден особый тип, который импортируется из React -
Dispatch<SetStateAction<  ....    >> который сам ждет на вход дженериком значение типа данных, которое хранится в этом стейте (подумайте какое оно в нашем случае)





