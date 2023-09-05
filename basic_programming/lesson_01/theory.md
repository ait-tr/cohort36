# Numeral Systems (Системы счисления)

## Positional Counting in Various Numeral Systems (Порядковый счет в различных системах счисления)

In modern life, we use positional numeral systems, where the value of a digit depends on its position in the number representation. Therefore, in the following, we will only discuss them, omitting the term "positional."

В современной жизни мы используем позиционные системы счисления, то есть системы, в которых число, обозначаемое цифрой, зависит от положения цифры в записи числа. Поэтому в дальнейшем мы будем говорить только о них, опуская термин «позиционные».

To learn how to convert numbers from one system to another, let's understand the sequential representation of numbers using the decimal system as an example.

Для того чтобы научиться переводить числа из одной системы в другую, поймем, как происходит последовательная запись чисел на примере десятичной системы.

Since we're using the decimal system, we have 10 symbols (digits) to build numbers. We start counting: `0`, `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`. Digits have been exhausted. We increase the digit place and reset the least significant digit: 10.

Поскольку у нас десятичная система счисления, мы имеем 10 символов (цифр) для построения чисел. Начинаем порядковый счет: `0`, `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`. Цифры закончились. Мы увеличиваем разрядность числа и обнуляем младший разряд: 10.

Then we increase the least significant digit again until all digits are exhausted: 11, 12, 13, 14, 15, 16, 17, 18, 19. We increase the next digit place by 1 and reset the least significant: 20.

Затем опять увеличиваем младший разряд, пока не закончатся все цифры: 11, 12, 13, 14, 15, 16, 17, 18, 19. Увеличиваем старший разряд на 1 и обнуляем младший: 20.

When we use all digits for both digit places (reaching the number 99), we increase the digit places again and reset the existing places: 100. And so on.

Когда мы используем все цифры для обоих разрядов (получим число 99), опять увеличиваем разрядность числа и обнуляем имеющиеся разряды: 100. И так далее.

Let's try the same in binary, quinary, and hexadecimal systems:

Попробуем сделать то же самое в двоичной, пятеричной и шестнадцатеричной системах:

| x<sub>10</sub> | x<sub>2</sub> | x<sub>16</sub> | x<sub>5</sub> |
| -------------: | ------------: | -------------: | ------------: |
| ` 0`           | `    0`       | ` 0`           | ` 0`          |
| ` 1`           | `    1`       | ` 1`           | ` 1`          |
| ` 2`           | `   10`       | ` 2`           | ` 2`          |
| ` 3`           | `   11`       | ` 3`           | ` 3`          |
| ` 4`           | `  100`       | ` 4`           | ` 4`          |
| ` 5`           | `  101`       | ` 5`           | `10`          |
| ` 6`           | `  110`       | ` 6`           | `11`          |
| ` 7`           | `  111`       | ` 7`           | `12`          |
| ` 8`           | ` 1000`       | ` 8`           | `13`          |
| ` 9`           | ` 1001`       | ` 9`           | `14`          |
| `10`           | ` 1010`       | ` A`           | `20`          |
| `11`           | ` 1011`       | ` B`           | `21`          |
| `12`           | ` 1100`       | ` C`           | `22`          |
| `13`           | ` 1101`       | ` D`           | `23`          |
| `14`           | ` 1110`       | ` E`           | `24`          |
| `15`           | ` 1111`       | ` F`           | `30`          |
| `16`           | `10000`       | `10`           | `31`          |

If the numeral system has a base greater than 10, additional symbols need to be introduced, often using Latin alphabet letters. For example, in the hexadecimal system, in addition to the ten digits, two letters (`A` and `B`) are used.

Если система счисления имеет основание больше 10, то нам придется вводить дополнительные символы, принято вводить буквы латинского алфавита. Например, для двенадцатеричной системы кроме десяти цифр нам понадобятся две буквы (`A` и `B`).

## Conversion from Decimal to Any Other Base (Перевод из десятичной системы счисления в любую другую)

To convert a positive integer from the decimal system to a system with a different base, divide the number by the base. Divide the quotient obtained by the base again, and repeat until the quotient becomes less than the base. Finally, write the last quotient and all remainders in one line, starting from the last remainder.

Чтобы перевести целое положительное десятичное число в систему счисления с другим основанием, нужно это число разделить на основание. Полученное частное снова разделить на основание, и дальше до тех пор, пока частное не окажется меньше основания. В результате записать в одну строку последнее частное и все остатки, начиная с последнего.

Let's convert the decimal number 46 to the binary system.

Переведем десятичное число 46 в двоичную систему счисления.

![](https://ege-study.ru/wp-content/uploads/2015/09/perevod1.jpg)

46 = `101110`<sub>2</sub>.

## Conversion from Any Base to Decimal (Перевод из любой системы счисления в десятичную)

To convert numbers from any other base to decimal, analyze the familiar representation of a decimal number. For example, the decimal number 325 can be understood as 3 hundreds, 2 tens, and 5 units:

Для того, чтобы научиться переводить числа из любой другой системы в десятичную, проанализируем привычную нам запись десятичного числа.
Например, десятичное число 325 – это 3 сотни, 2 десятка и 5 единиц, т.е.

`325`<sub>10</sub>= `3` * 100 + `2` * 10 + `5`.

Similarly, in other numeral systems, we multiply by powers of the base instead of 10, 100, etc. For example, consider the number 1201 in the ternary system. Number the positions from right to left, starting from zero, and express the number as the sum of the products of the digit and the base raised to the power of the position:

Точно так же обстоит дело и в других системах счисления, только умножать будем не на 10, 100 и пр., а на степени основания системы счисления. Для примера возьмем число 1201 в троичной системе счисления. Пронумеруем разряды справа налево начиная с нуля и представим наше число как сумму произведений цифры на тройку в степени разряда числа:

`3 2 1 0`<br>
`1 2 0 1`<sub>3</sub>= `1` * 3 <sup>3</sup> + `2` * 3<sup>2</sup> + `0` * 3<sup>1</sup> + `1` * 3<sup>0</sup> = 27 + 18 + 0 + 1 = 46.

This is the decimal representation of the number (это и есть десятичная запись нашего числа): `1201`<sub>3</sub> = `46`<sub>10</sub>.

## Conversion from Binary to Power of Two Bases (e.g., 16) (Перевод из двоичной системы в систему с основанием «степень двойки» (например, 16))

To convert a binary number to a number with a base that is a power of two, divide the binary sequence into groups with the number of digits equal to the power of the new base. Replace each group with the corresponding digit of the new base using the conversion table.

Для преобразования двоичного числа в число с основанием «степень двойки» необходимо двоичную последовательность разбить на группы по количеству цифр равному степени справа налево и каждую группу заменить соответствующей цифрой новой системы счисления.

For instance, let's convert the binary number `1100001111010110` to the hexadecimal system. Divide it into groups of 4 digits each (since 16 = 2<sup>4</sup>), and then replace each group with the corresponding digit from the conversion table:

Например, Переведем двоичное `1100001111010110` число в шестнадцатеричную систему. Для этого разобьем его на группы по 4 символа (т.к. 16 = 2<sup>4</sup>), начиная справа, а затем воспользуемся таблицей соответствия и заменим каждую группу на новую цифру:

We learned to create the conversion table in the first section.

Таблицу соответствия мы научились строить в п.1.

`1100001111010110`<sub>2</sub> = `1100 0011 1101 0110`<sub>2</sub> = `C3D6`<sub>16</sub>.

# Conversion from Power of Two Bases (e.g., 16) to Binary (Перевод из системы с основанием «степень двойки» (например, 16) в двоичную)

This conversion is analogous to the previous one but done in reverse: each digit is replaced by a group of binary digits from the conversion table.

Этот перевод аналогичен предыдущему, выполненному в обратную сторону: каждую цифру мы заменяем группой цифр в двоичной системе из таблицы соответствия.

Let's convert the hexadecimal number C3A6 to the binary system.

Переведем шестнадцатеричное число С3A6 в двоичную систему счисления.

For each digit of the hexadecimal number, replace it with a group of 4 digits (since 16 = 2<sup>4</sup>) from the conversion table, adding leading zeroes if necessary:

Для этого каждую цифру числа заменим группой из 4 цифр (т.к. 16 = 2<sup>4</sup>) из таблицы соответствия, дополнив при необходимости группу нулями вначале:

* C<sub>16</sub> = 1100<sub>2</sub>
* 3<sub>16</sub> = 0011<sub>2</sub>
* A<sub>16</sub> = 1010<sub>2</sub>
* 6<sub>16</sub> = 0110<sub>2</sub>

`C3A6`<sub>16</sub> = `1100 0011 1010 0110`<sub>2</sub>.
