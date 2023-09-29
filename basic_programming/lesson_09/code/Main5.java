package classwork;

import java.util.Scanner;

/**
 * 9/29/2023
 * lesson_09
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[5]; // объявили массив из 5 элементов

        // ввод
        for (int i = 0; i < 5; i++) {
            array[i] = scanner.nextInt();
        }

        // вывод
        for (int i = 0; i < 5; i++) {
            System.out.println(array[i]);
        }

        // подсчет суммы
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            sum = sum + array[i];
        }

        System.out.println("Сумма чисел - " + sum);
    }
}
