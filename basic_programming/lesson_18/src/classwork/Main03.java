package classwork;

import java.util.Scanner;

public class Main03 {
    // Определить, является ли год высокосным по номеру года
    // любой год, который делится без остатка на 4 будет высокосным.
    // год, который делится без остатка на 100 (например, 1900) является високосным годом
    // только в том случае, если он также без остатка делится на 400.

    public static boolean isLeapYear(int year) {
        // выполняем то самое условие, написанное выше
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        System.out.println("Year is leap year: " + isLeapYear(year));
    }
}
