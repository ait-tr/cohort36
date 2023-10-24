package classwork;

import java.util.Scanner;

public class Main02 {
    /*
    Устранить ошибку в программе: любые числа принимаются программой, хотя должны только от 1 до 10
     */

    public static int readInput() {
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            System.out.println("Enter number from 1 to 10");
            int n = scanner.nextInt();
            // если введено число которое больше равно 1 и меньше равно 10, вернуть это число
            // Ошибка была: оператор ИЛИ вместо И
            if (1 <= n && n <= 10) {
                return n;
            }
        }
    }

    public static void main(String[] args) {
        // вызываем метод
        int n = readInput();
        System.out.println("Вы ввели число " + n);
    }
}
