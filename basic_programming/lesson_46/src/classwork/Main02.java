package classwork;

import java.util.Scanner;

public class Main02 {
    /*
    Написать программу, которая будет считать гипотенузу треугольника по двум катетам
    Катеты должны вводиться из консоли
    После ввода длинн катетов, проверить может ли впринципе существовать такой треугольник
     */

    public static void main(String[] args) {
        // создаем сканнер чтобы читать ввод из консоли
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длинны катетов");
        // читаем длинну первого катета
        double a = scanner.nextInt();
        // читаем длинну второго катета
        double b = scanner.nextInt();
        // если один из катетов меньше или равен 0, такой треугольник не может существовать
        if (a <= 0 || b <= 0) {
            System.out.println("Катет не может быть меньше 0!");
        } else {
            // в ином случае, считаем гипотенузу
            double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
            System.out.println("Длинна гипотенузы: " + c);
        }
    }
}
