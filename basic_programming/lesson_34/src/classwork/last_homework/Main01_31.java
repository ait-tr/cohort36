package classwork.last_homework;

import java.util.Scanner;

public class Main01_31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();

        double res = a * (b - d) + (c * a) / d;
        System.out.println("Result " + res);
    }
}
