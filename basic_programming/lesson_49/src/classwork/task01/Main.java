package classwork.task01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double res = 0;
        // пытаемся выполнить код
        try {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            res = a / b;
        } catch (InputMismatchException ex) {
            // если было исключение этого типа, ловим его и обрабатываем
            System.out.println("You inputted wrong symbols!");
        }
        System.out.println("Result: " + res);
    }
}
