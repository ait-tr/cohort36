package classwork;

import java.util.Scanner;

public class Main03 {
    // Решить квадратное уравнение общего вида
    // ax^2 + bx + c = 0

    public static double discriminant(double a, double b, double c) {
        // считаем по формуле дискриминант
        return b * b - 4 * a * c;
    }

    public static void solveAndPrintRoots(double a, double b, double c) {
        // вызываем метод, который посчитает дискриминант уравнения
        // записываем результат процедуры в переменную, а не саму процедуру!
        double d = discriminant(a, b, c);
        // считаем первый корень
        double x1 = (-b + Math.sqrt(d)) / (2 * a);
        // считаем второй корень
        double x2 = (-b - Math.sqrt(d)) / (2 * a);
        // вывести результат
        System.out.println("x1 = " + x1 + ", x2 = " + x2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        //вызываем метод, который решит уравнение и выведет результат
        solveAndPrintRoots(a, b, c);
    }
}
