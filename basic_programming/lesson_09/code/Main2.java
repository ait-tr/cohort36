package classwork;

import java.util.Scanner;

/**
 * 9/29/2023
 * lesson_09
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] days = new double[3];

        days[0] = scanner.nextDouble();
        days[1] = scanner.nextDouble();
        days[2] = scanner.nextDouble();

        double average = (days[0] + days[1] + days[2]) / 3;

        System.out.println(average);
    }
}
