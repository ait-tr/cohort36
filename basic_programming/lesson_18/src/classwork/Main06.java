package classwork;

import java.util.Scanner;

public class Main06 {
    // Написать калькулятор, в котором можно будет выбирать какую операцию сделать в форме меню
    // Сделать так, чтобы можно было бесконечно пользоваться калькулятором, и закончить его выполнение когда захочется

    public static void printMenuText() {
        System.out.println("1. Прибавить");
        System.out.println("2. Отнять");
        System.out.println("3. Умножить");
        System.out.println("4. Разделить");
        System.out.println("5. Выход");
    }
    // метод для чтения ввода
    public static int readInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        return scanner.nextInt();
    }

    //четыре метода для разных рассчетов
    public static void sum() {
        int a = readInput();
        int b = readInput();

        System.out.println(a + " + " + b + " = " + (a + b));
    }

    public static void diff() {
        int a = readInput();
        int b = readInput();

        System.out.println(a + " - " + b + " = " + (a - b));
    }

    public static void mul() {
        int a = readInput();
        int b = readInput();

        System.out.println(a + " * " + b + " = " + (a * b));
    }

    public static void div() {
        int a = readInput();
        int b = readInput();

        System.out.println(a + " / " + b + " = " + (a / b));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // переменная, в которую читаем ввод
        int input;
        do {
            // печатаем текст меню
            printMenuText();
            // читаем ввод
            input = scanner.nextInt();
            // в зависимости от ввода, выполняем разные функции. В этом и состояла идея меню
            switch (input) {
                case 1:
                    sum();
                    break;
                case 2:
                    diff();
                    break;
                case 3:
                    mul();
                    break;
                case 4:
                    div();
                    break;
                case 5:
                    // ничего не делаем, если 5. Это значит выход
                    break;
                default:
            }
        } while (input != 5); // если пользователь ввел 5, завершаем выполнение программы
    }
}
