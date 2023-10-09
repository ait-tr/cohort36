package classwork;

import java.util.Scanner;

public class Main02 {
    // Считать целое число и посчитать его факториал

    /*
    5! = 1 * 2 * 3 * 4 * 5 = 120
    7! = 1 * 2 * 3 * 4 * 5 * 6 * 7 = 5040
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input natural number: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("You inputted not a natural number!");
            return;
        }

        long result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        System.out.println(result);
    }
}
