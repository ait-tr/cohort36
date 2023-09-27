package classwork;

import java.util.Scanner;

/**
 * 9/27/2023
 * lesson_08
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main04 {
    // Вывести сумму цифр входного числа
    // 3478 -> 3 + 4 + 7 + 8 = 22
    // 123 -> 1 + 2 + 3 = 6
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        int digitsSum = 0;

        while (number != 0) {
            int lastDigit = number % 10;
            digitsSum = digitsSum + lastDigit;
            number = number / 10;
        }

        System.out.println(digitsSum);
    }
}
