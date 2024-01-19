## 01. Практика
* Test-Driven development - разработка, в которой курс задается уже написанными тестами.


* RegEx (Regular Expression, регулярные выражения) - маленький "язык программирования", который создан для более 
легкой работы со строками.
* Методы replace, matches и split принимают именно эти выражения, а не обычные строки.
  * replace - принимает регекс и другую строку, заменяет все части текущей строки которая совпадает с регексом на другую строку.
  * matches - возвращает истину, если строка подходит под переданный регекс.
  * split - разделяет строку на массив строк по данному регексу.

* Вот собственно и сам regex: 

        [abc] - matches only one of symbols (a, b or c)
        [^abc] - matches only one symbol except for a, b or c
        [a-z] - matches all symbols between a and z

        . - any symbol, only one
        ^ - beginning of a string
        $ - end of a string

        \d - any digit
        \s - whitespace character
        \b - beginning of the word
        \u XXXX - unicode character, where XXXX is its numeric value in hex

        n+ - matches one or more letters n
        n* - matches zero or more letters n
        n? - matches zero or one letters n
        () - exact phrase, if need to use any of operators above on it

        n{x} - contains "n" x times
        n{x,y} - contains "n" x to y times
        n{x,} - contains "n" at least x times
