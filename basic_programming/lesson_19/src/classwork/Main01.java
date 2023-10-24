package classwork;

import java.util.Scanner;

public class Main01 {
    // устранить ошибки в программе:
    // 1 из программы невозможно выйти используя опцию 5 "выход"
    // 2 текст меню выводится только один раз
    // 3 метод умножения считает квадрат первого числа, а должен произведение двух чисел
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
        // ошибка была: было написано а * а
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
            // ошибка была: эта строка написана вне цикла
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
            // ошибка была: впесто 5 стояло 6
        } while (input != 5); // если пользователь ввел 5, завершаем выполнение программы
    }
}
