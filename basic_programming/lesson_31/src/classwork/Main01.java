package classwork;

import java.util.Scanner;

/*
Считать две переменные и посчитать сумму
 */

public class Main01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a + " + " + b + " = " + (a + b));
    }
}
