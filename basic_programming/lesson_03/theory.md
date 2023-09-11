# Primitive Data Types (Примитивные типы данных)

In Java, a primitive type is a data type that is predefined in the language and named by a reserved keyword. These types serve as the building blocks for data manipulation in Java programs. Here are the 8 primitive data types in Java, along with their size and a brief Description (описание):

В Java примитивный тип — это тип данных, который предопределен в языке и имеет имя, зарезервированное ключевым словом. Эти типы служат строительными блоками для манипуляций с данными в программах на Java. Вот 8 примитивных типов данных в Java, а также их размер и краткое описание:

1. `byte`:
   - Size (размер): 8 bits (1 byte)
   - Range (диапазон): -128 to 127
   - Description (описание): A `byte` data type can be useful to save memory in large arrays.

     Тип данных `byte` может быть полезен для экономии памяти в больших массивах.

2. `short`:
   - Size (размер): 16 bits (2 bytes)
   - Range (диапазон): -32,768 to 32,767
   - Description (описание): The `short` data type can also save memory, and is used for values that can fit within its range.

     Тип данных `short` также может экономить память и используется для значений, которые укладываются в его диапазон.


3. `int`:
   - Size (размер): 32 bits (4 bytes)
   - Range (диапазон): -2,147,483,648 to 2,147,483,647
   - Description (описание): The `int` data type is generally used as the default data type for integral values, unless there is a concern about memory.

     Тип данных `int` обычно используется как тип данных по умолчанию для целочисленных значений, если нет озабоченности по поводу памяти.

4. `long`:
   - Size (размер): 64 bits (8 bytes)
   - Range (диапазон): -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
   - Description (описание): The `long` data type can store much larger values, and is used when `int` is not large enough to hold the value.

     Тип данных `long` может хранить гораздо большие значения и используется, когда `int` не достаточно для хранения значения.

5. `float`:
   - Size (размер): 32 bits (4 bytes)
   - Range (диапазон): Approximately ±3.40282347E+38F (7 decimal digits)
   - Description (описание): The `float` data type can store fractional numbers, but with limited precision.

     Тип данных `float` может хранить дробные числа, но с ограниченной точностью.

6. `double`:
   - Size (размер): 64 bits (8 bytes)
   - Range (диапазон): Approximately ±1.79769313486231570E+308 (15 decimal digits)
   - Description (описание): The `double` data type is a double-precision 64-bit floating-point. It is used for decimal values and also to store scientific notations.

     Тип данных `double` представляет собой 64-битное число с плавающей запятой двойной точности. Он используется для десятичных значений, а также для хранения научных обозначений.

7. `char`:
   - Size (размер): 16 bits (2 bytes)
   - Range (диапазон): 0 to 65,535 (represents Unicode characters)
   - Description (описание): The `char` data type is used to store a single character.

     Тип данных `char` используется для хранения одного символа.

8. `boolean`:
   - Size (размер): Not precisely defined, but effectively 1 bit
   - Range (диапазон): `true` or `false`
   - Description (описание): The `boolean` data type is used to store `true`/`false` values.

     Тип данных `boolean` используется для хранения значений `true`/`false`.

These primitive types serve as the basis for creating more complex data types and objects in Java. Moreover, each of these primitive types has a corresponding wrapper class in the Java library which allows them to be used as objects, offering a broader range of operations and manipulations.

Эти примитивные типы служат основой для создания более сложных типов данных и объектов в Java. Кроме того, каждый из этих примитивных типов имеет соответствующий оберточный класс в библиотеке Java, который позволяет использовать их как объекты, предлагая более широкий спектр операций и манипуляций.

# Arithmetic Operators (Арифметические операторы)

In Java, arithmetic operators are used to perform mathematical operations between variables or values. Here are the primary arithmetic operators you'll encounter:

В Java арифметические операторы используются для выполнения математических операций между переменными или значениями. Вот основные арифметические операторы, с которыми вы столкнетесь:

1. **Addition (`+`)**: Adds two values together.
   ```java
   int sum = 5 + 3; // sum will be 8
   ```

   **Сложение (`+`)**: Складывает два значения вместе.
   ```java
   int sum = 5 + 3; // сумма будет равна 8
   ```

2. **Subtraction (`-`)**: Subtracts the right operand from the left operand.
   ```java
   int difference = 5 - 3; // difference will be 2
   ```

   **Вычитание (`-`)**: Вычитает правый операнд из левого операнда.
   ```java
   int difference = 5 - 3; // разность будет равна 2
   ```

3. **Multiplication (`*`)**: Multiplies the left operand by the right operand.
   ```java
   int product = 5 * 3; // product will be 15
   ```

   **Умножение (`*`)**: Умножает левый операнд на правый операнд.
   ```java
   int product = 5 * 3; // произведение будет равно 15
   ```

4. **Division (`/`)**: Divides the left operand by the right operand. Note that if both operands are integers, the result will be an integer (**truncated**, not rounded).
   ```java
   int quotient = 5 / 3; // quotient will be 1
   ```

   **Деление (`/`)**: Делит левый операнд на правый операнд. Обратите внимание, что если оба операнда являются целыми числами, результат будет целым числом (**обрубленным**, а не округленным).
   ```java
   int quotient = 5 / 3; // частное будет равно 1
   ```

5. **Modulus (`%`)**: Returns the remainder of the division of the left operand by the right operand.
   ```java
   int remainder = 5 % 3; // remainder will be 2
   ```

   **Остаток от деления (`%`)**: Возвращает остаток от деления левого операнда на правый операнд.
   ```java
   int remainder = 5 % 3; // остаток от деления будет равен 2
   ```

6. **Increment (`++`)**: Increases the value of a variable by 1. It can be used in both postfix (`x++`) and prefix (`++x`) form.
   ```java
   int x = 5;
   x++; // x will be 6
   ```

   **Инкремент (`++`)**: Увеличивает значение переменной на 1. Может использоваться как в постфиксной (`x++`), так и в префиксной (`++x`) форме.
   ```java
   int x = 5;
   x++; // x будет равно 6
   ```

7. **Decrement (`--`)**: Decreases the value of a variable by 1. Like the increment operator, it can be used in both postfix (x--) and prefix (--x) form.
   ```java
   int x = 5;
   x--; // x will be 4
   ```

   **Декремент (`--`)**: Уменьшает значение переменной на 1. Как и оператор инкремента, может использоваться как в постфиксной (`x--`), так и в префиксной (`--x`) форме.
   ```java
   int x = 5;
   x--; // x будет равно 4
   ```

## Compound Assignment Operators (Составные операторы присваивания)

In addition to these, Java supports compound assignment operators which are a combination of an arithmetic operator and the assignment operator (`=`). Here are examples:

Кроме того, Java поддерживает операторы сложного присваивания, которые являются комбинацией арифметического оператора и оператора присваивания (`=`). Вот примеры:

- **Addition Assignment (`+=`)**: Adds the right operand to the left operand and assigns the result to the left operand.
   ```java
   int x = 5;
   x += 3; // x will be 8
   ```

   **Сложение с присваиванием (`+=`)**: Добавляет правый операнд к левому операнду и присваивает результат левому операнду.
   ```java
   int x = 5;
   x += 3; // x будет равно 8
   ```

- **Subtraction Assignment (`-=`)**: Subtracts the right operand from the left operand and assigns the result to the left operand.
   ```java
   int x = 5;
   x -= 3; // x will be 2
   ```

   **Вычитание с присваиванием (`-=`)**: Вычитает правый операнд из левого операнда и присваивает результат левому операнду.
   ```java
   int x = 5;
   x -= 3; // x будет равно 2
   ```

- **Multiplication Assignment (`*=`)**: Multiplies the left operand by the right operand and assigns the result to the left operand.
   ```java
   int x = 5;
   x *= 3; // x will be 15
   ```

   **Умножение с присваиванием (`*=`)**: Умножает левый операнд на правый операнд и присваивает результат левому операнду.
   ```java
   int x = 5;
   x *= 3; // x будет равно 15
   ```

- **Division Assignment (`/=`)**: Divides the left operand by the right operand and assigns the result to the left operand.
   ```java
   int x = 5;
   x /= 3; // x will be 1
   ```

   **Деление с присваиванием (`/=`)**: Делит левый операнд на правый операнд и присваивает результат левому операнду.
   ```java
   int x = 5;
   x /= 3; // x будет равно 1
   ```

- **Modulus Assignment (`%=`)**: Computes the remainder of the division of the left operand by the right operand and assigns the result to the left operand.
   ```java
   int x = 5;
   x %= 3; // x will be 2
   ```

   **Остаток от деления с присваиванием (`%=`)**: Вычисляет остаток от деления левого операнда на правый операнд и присваивает результат левому операнду.
   ```java
   int x = 5;
   x %= 3; // x будет равно 2
   ```

When using these operators, it's important to be aware of the type of the operands to avoid unexpected behavior, especially regarding integer division and the potential for arithmetic overflow or underflow.

При использовании этих операторов важно знать тип операндов, чтобы избежать неожиданного поведения, особенно в отношении целочисленного деления и потенциального арифметического переполнения или недополнения.

# `Scanner`

In Java, the `Scanner` class is a part of the `java.util` package, which is used to parse text for strings and primitive types using regular expressions. It is typically utilized to read input from the user via the console, but it can also be used to read input from other sources like files. Here's a brief overview of the `Scanner` class:

## Importing the `Scanner` Class (Импорт класса `Scanner`)
To use the `Scanner` class in your program, first, import it as follows:

Чтобы использовать класс `Scanner` в вашей программе, сначала импортируйте его следующим образом:

```java
import java.util.Scanner;
```

## Creating a Scanner Object (Создание сканера)
You can create an instance of the `Scanner` class in several ways, most commonly to read from the console (`System.in`).

Вы можете создать экземпляр класса `Scanner` несколькими способами, чаще всего для чтения из консоли (`System.in`).

```java
// Creating a Scanner object to read input from the console
// Создание объекта Scanner для чтения ввода с консоли
Scanner scanner = new Scanner(System.in);
```

## Methods (Методы)

The `Scanner` class provides various methods to parse and read different types of input. Here are some common methods:

Класс `Scanner` предлагает различные методы для анализа и чтения различных типов ввода. Вот некоторые общие методы:

- `next()`: Finds and returns the next complete token from this scanner.

  Находит и возвращает следующий полный токен из этого сканера.
- `nextLine()`: Advances this scanner past the current line and returns the input that was skipped.

  Перемещает этот сканер за текущую строку и возвращает пропущенный ввод.
- `nextInt()`: Scans the next token of the input as an `int`.

  Сканирует следующий токен ввода как `int` (целое число).
- `nextDouble()`: Scans the next token of the input as a `double`.

  Сканирует следующий токен ввода как `double` (вещественное число).
- `nextBoolean()`: Scans the next token of the input as a `boolean`.

  Сканирует следующий токен ввода как `boolean` (логическое значение).
- `close()`: Closes the scanner.

  Закрывает сканер.

## Example Usage (Пример использования)
Here is a simple example demonstrating how to use the `Scanner` class to read input from the user:

Вот простой пример, демонстрирующий, как использовать класс `Scanner` для чтения ввода пользователя:

```java
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your name: ");
    String name = scanner.nextLine();

    System.out.print("Enter your age: ");
    int age = scanner.nextInt();

    System.out.println("Hello " + name + ", You are " + age + " years old.");

    scanner.close();
  }
}
```

## Closing the Scanner (Закрытие сканера)

It is good practice to close the `Scanner` object when it is no longer needed to free up the resources it may be consuming. This can be done using the `close()` method, as shown in the example above.

Хорошей практикой является закрытие объекта `Scanner`, когда он больше не нужен, чтобы освободить ресурсы, которые он может потреблять. Это можно сделать с помощью метода `close()`, как показано в примере выше.
