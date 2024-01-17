package classwork;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main01 {

    /*
    Разработать программу, в которой можно будет ввести число без ошибок при неправильном вводе
     */

    public static int readNumber(String message) throws Exception {
        Scanner scanner = new Scanner(System.in);
        // выводим сообщение
        System.out.println(message);
        try {
            // читаем ввод
            int n = scanner.nextInt();
            return n;
        } catch (InputMismatchException ex) { // если ловим исключение
            throw new Exception(ex); // используем exception chaining
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to addition calculator");
        int a = 0;
        int b = 0;
        try {
            a = readNumber("Enter first number");
            b = readNumber("Enter second number");
        } catch (Exception e) {
            // e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println("Result: " + (a + b));
    }
}
