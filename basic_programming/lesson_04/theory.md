# Comparison (Сравнение)

The simplest way to compare two numbers is by using relational operators. Here are the relational operators available in Java:

Самый простой способ сравнить два числа - использование операторов сравнения. Вот операторы сравнения, доступные в Java:

- `==`: Equals to (равно)
- `!=`: Not equals to (не равно)
- `>`: Greater than (больше)
- `<`: Less than (меньше)
- `>=`: Greater than or equals to (больше или равно)
- `<=`: Less than or equals to (меньше или равно)

Example (Пример):

```java
int a = 5;
int b = 10;

System.out.println(a == b); // false
System.out.println(a != b); // true
System.out.println(a > b);  // false
System.out.println(a < b);  // true
System.out.println(a >= b); // false
System.out.println(a <= b); // true
```

# Comparing Floating Point Numbers (Сравнение дробных чисел)

Comparing floating-point numbers directly with relational operators can sometimes lead to inaccurate results due to precision errors. It's often better to compare them using a tolerance value.

Сравнение дробных чисел непосредственно при помощи операторов сравнения может иногда приводить к некорректным результатам из-за неточного хранения. Часто лучшим выходом оказывается сравнение с использованием значения пограшности

Example (Пример):

```java
Copy code
double a = 0.1 + 0.2;
double b = 0.3;
double tolerance = 0.0001;

System.out.println(Math.abs(a - b) < tolerance); // true
```

# Conditional Operator (Условный оператор)

In Java, the `if-else` statement is used to execute one block of code if a particular condition is true, and another block of code if the condition is false. Here is a general structure of how you can use `if-else` statements in Java:

В Java оператор `if-else` используется для выполнения одного блока кода, если определенное условие истинно, и другого блока кода, если условие ложно. Вот общая структура того, как можно использовать операторы `if-else` в Java:

```java
if (condition) { // условие
  // block of code to be executed if the condition is true
  // блок кода, который будет выполнен, если условие истинно
} else {
  // block of code to be executed if the condition is false
  // блок кода, который будет выполнен, если условие ложно
}
```

You can also use an `else if` statement to specify a new condition to test, in case the first condition is false:

Вы также можете использовать оператор `else if`, чтобы указать новое условие для проверки, в случае если первое условие ложно:

```java
if (condition1) { // условие1
  // block of code to be executed if condition1 is true
  // блок кода, который будет выполнен, если условие1 истинно
} else if (condition2) { // условие2
  // block of code to be executed if condition1 is false and condition2 is true
  // блок кода, который будет выполнен, если условие1 ложно и условие2 истинно
} else {
  // block of code to be executed if both condition1 and condition2 are false
  // блок кода, который будет выполнен, если условие1 и условие2 ложны
}
```

Let’s break down the components of the `if-else` statement:

Разберем компоненты оператора `if-else`:

1. `if`: This keyword is used to specify the condition to be tested.

   Это ключевое слово используется для указания условия, которое следует проверить.
2. `condition`: This is a boolean expression that the `if` statement will evaluate. If this expression evaluates to `true`, the block of code inside the `if` statement will be executed. If it evaluates to `false`, the `else` block (if present) will be executed.

   Логическое выражение, которое оператор `if` будет оценивать. Если это выражение имеет значение `true`, будет выполнен блок кода внутри оператора `if`. Если это значение `false`, будет выполнен блок `else` (если он присутствует).
3. `else`: This keyword is used to specify a block of code to be executed if the condition tested by the `if` statement is `false`.

   Это ключевое слово используется для указания блока кода, который будет выполнен, если условие, проверяемое оператором `if`, ложно.
4. `else if`: This construct can be used to chain multiple conditions together, where each subsequent condition is tested if the previous conditions were false.

   Эта конструкция может быть использована для объединения нескольких условий, где каждое последующее условие проверяется, если предыдущие условия были ложными.

Here is an example illustrating the use of `if-else` statements:

Вот пример, иллюстрирующий использование операторов `if-else`:

```java
int number = 10;

if (number > 0) {
  System.out.println("The number is positive.");
  System.out.println("Число положительное.");
} else if (number < 0) {
  System.out.println("The number is negative.");
  System.out.println("Число отрицательное.");
} else {
  System.out.println("The number is zero.");
  System.out.println("Число равно нулю.");
}
```

Output:
```
The number is positive.
Число положительное.
```

In this example, since the `number` variable is positive (10 > 0), the statement "The number is positive." is printed to the console.

В этом примере, поскольку переменная `number` положительна (10 > 0), на консоль выводится сообщение "Число положительное.".

# Ternary Operator

The ternary operator is a shorthand way of writing an `if-else` statement. It allows you to evaluate a boolean expression and choose one of two values depending on the outcome. The ternary operator has the following syntax:

Тернарный оператор представляет собой сокращенный способ записи инструкции `if-else`. Он позволяет вам оценить булево выражение и выбрать одно из двух значений в зависимости от результата. У тернарного оператора следующий синтаксис:

```java
condition ? valueIfTrue : valueIfFalse;
условие ? значениеЕслиИстина : значениеЕслиЛожь;
```

Here's a breakdown of the syntax:

Вот разбор синтаксиса:

- `condition`: This is the boolean expression that will be evaluated. If the expression evaluates to `true`, the operator will return `valueIfTrue`; otherwise, it will return `valueIfFalse`.

  `условие`: Это булево выражение, которое будет оценено. Если выражение оценивается как `true`, оператор вернет `значениеЕслиИстина`; в противном случае он вернет `значениеЕслиЛожь`.
- `valueIfTrue`: This is the value that will be returned if the condition is `true`.

  `значениеЕслиИстина`: Это значение, которое будет возвращено, если условие истинно.
- `valueIfFalse`: This is the value that will be returned if the condition is `false`.

  `значениеЕслиЛожь`: Это значение, которое будет возвращено, если условие ложно.

Here's an example of how you might use the ternary operator:

Вот пример того, как можно использовать тернарный оператор:

```java
int x = 10;
int y = 20;
String result = (x > y) ? "x is greater than y" : "x is not greater than y";
// String result = (x > y) ? "x больше y" : "x не больше y";
System.out.println(result); // Output: x is not greater than y // Вывод: x не больше y
```

In the above code:

В вышеописанном коде:

1. We have two integer variables, `x` and `y`, with values 10 and 20, respectively.

   У нас две переменные типа int, `x` и `y`, со значениями 10 и 20 соответственно.
2. We use the ternary operator to evaluate the expression `x > y`. Since `x` is not greater than `y`, the condition is false.

   Мы используем тернарный оператор для оценки выражения `x > y`. Поскольку `x` не больше `y`, условие ложно.
3. Since the condition is false, the value of the `result` variable is set to `"x is not greater than y"`.

   Поскольку условие ложно, значение переменной `result` устанавливается в `"x не больше y"`.
4. We then print the value of the `result` variable to the console.

   Затем мы выводим значение переменной `result` на консоль.

This operator helps in writing concise and compact code but should be used judiciously to maintain readability.

Этот оператор помогает писать краткий и компактный код, но его следует использовать с осторожностью, чтобы сохранить читаемость.
