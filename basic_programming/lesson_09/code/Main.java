package classwork;

import java.util.Scanner;

/**
 * 9/29/2023
 * lesson_09
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main {
    // Собрать данные по погоде за три дня и вывести среднее значение
    // 15, 20, 25 -> 20
    // 10, 13, 17 -> 13 с чем-то
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double day1 = scanner.nextDouble();
        double day2 = scanner.nextDouble();
        double day3 = scanner.nextDouble();
        double day4 = scanner.nextDouble();


        double average = (day1 + day2 + day3 + day4) / 4;

        System.out.println(average);
    }
}
