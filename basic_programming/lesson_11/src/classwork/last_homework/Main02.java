package classwork.last_homework;

import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        // считывание вводных данных
        Scanner scanner = new Scanner(System.in);
        int a1 = scanner.nextInt();
        int d = scanner.nextInt();
        int n = scanner.nextInt();
        // делаем примерно тоже самое что и в задании Main01
        int[] progression = new int[10];
        progression[0] = a1;
        // переменная для подсчета суммы
        int sum = a1;
        for (int i = 1; i < n; i++) {
            progression[i] = progression[i - 1] + d;
            // подсчет суммы с только что рассчитанным элементом
            sum = sum + progression[i];
        }
        // вывод результата
        System.out.println("Sum: " + sum);
    }
}
