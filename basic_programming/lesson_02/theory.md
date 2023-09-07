# Hello World

Here is the source code for a typical "Hello World" program:

Вот исходный код типичной программы "Hello World":

```java
public class HelloWorld {

  public static void main(String[] args) {
    System.out.println("Hello, World!");
  }
}
```

Let's dissect each part of this program:

Разберем каждую часть этой программы:

1. **`public class HelloWorld { ... }`**

   - `public`: This is an access modifier which means that this class is accessible by any other class.

     Это модификатор доступа, который означает, что этот класс доступен для любого другого класса.
   - `class`: It is a keyword used to declare a class in Java.

     Это ключевое слово, используемое для объявления класса в Java.
   - `HelloWorld`: This is the name of the class, following the class keyword. Class names in Java typically start with a capital letter, and it's a convention to use CamelCase (PascalCase) for multi-word class names.

     Это название класса, следующее за ключевым словом class. Имена классов в Java обычно начинаются с заглавной буквы, и принято использовать CamelCase (PascalCase) для имен классов из нескольких слов.

2. **`public static void main(String[] args) { ... }`**
   
   - `public`: Again, this is an access modifier which means this method can be accessed by any class.

     Такой же модификатор доступа, который означает, что этот метод можно вызвать из любого класса.
   - `static`: This keyword means that the method belongs to the class rather than any particular instance of the class.

     Это ключевое слово означает, что метод принадлежит классу, а не какому-то конкретному экземпляру класса.
   - `void`: It indicates that the method doesn't return any value.

     Указание на то, что метод не возвращает никакого значения.
   - `main`: This is the name of the method. The `main` method is the entry point of any Java application.

     Это имя метода. Метод `main` является точкой входа в любое Java-приложение. Имена методов в Java обычно начинаются со строчной буквы, и принято использовать camelCase для имен классов из нескольких слов.
   - `String[] args`: These are the parameters passed to the `main` method. It's an array of strings which can accept command line arguments.

     Это параметры, передаваемые методу `main`. Это массив строк, который может принимать аргументы командной строки.

3. **`System.out.println("Hello, World!");`**

   - `System.out`: It is a built-in identifier of the output stream.

     Это встроенный идентификатор потока вывода.
   - `println`: It is a method of `System.out` which is used to print line in console. The string "Hello, World!" is passed as an argument to this method which gets printed to the console.

     Это метод `System.out`, который используется для вывода строки в консоль. Строка "Hello, World!" передается в качестве аргумента этому методу и выводится на консоль.

Putting it all together:

Собирая все вместе:

- We first define a public class named `HelloWorld`.

  Сначала мы определяем публичный класс с названием `HelloWorld`.
- Inside this class, we define a `main` method which serves as the entry point for the Java application.

  Внутри этого класса мы определяем метод `main`, который служит точкой входа для приложения на Java.
- Inside the `main` method, we call the `System.out.println` method to print "Hello, World!" to the console.

  Внутри метода `main` мы вызываем метод `System.out.println` для вывода "Hello, World!" в консоль.

# Variables (Переменные)

In Java, variables are used to store data that can be used and manipulated throughout a program. Here, I'll detail various aspects pertaining to variables in Java:

В Java переменные используются для хранения данных, которые можно использовать и изменять на протяжении всей программы. Давайте подробно рассмотрим различные аспекты переменных в Java:

## Declaration (Объявление)

Before you use a variable, you need to declare it. A variable declaration tells the compiler the variable's name and type. Here's the syntax for declaring a variable:

Прежде чем использовать переменную, её нужно объявить. Объявление переменной сообщает компилятору имя и тип переменной. Вот синтаксис для объявления переменной:

```java
type variableName;
```

## Initialization (Инициализация)

Once a variable is declared, you can initialize it, i.e., assign a value to it. Here's how you can do it:

После объявления переменной вы можете инициализировать её, то есть присвоить ей значение. Вот как это можно сделать:

```java
variableName = value;
```

or you can declare and initialize the variable at the same time:

или вы можете объявить и инициализировать переменную одновременно:

```java
type variableName = value;
```

If you assign a new value to the variable, the previous value will be lost completely.

Если вы присвоите переменной новое значение, предыдущее значение будет утеряно.
