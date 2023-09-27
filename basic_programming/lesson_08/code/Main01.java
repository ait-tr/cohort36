package classwork;

import java.util.Scanner;

/**
 * 9/27/2023
 * lesson_08
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число:");
        int number = scanner.nextInt();

        if (number < 10) {
            System.out.println("Это число меньше 10");
        } else if (number > 10) {
            System.out.println("Это число больше 10");
        } else {
            System.out.println("Это число равно 10");
        }

        System.out.println("Программа закончила работу");
    }
}
