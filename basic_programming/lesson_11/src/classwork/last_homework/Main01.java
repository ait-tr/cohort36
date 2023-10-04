package classwork.last_homework;

import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a1 = scanner.nextInt();
        int d = scanner.nextInt();
        // 1 вариант
        //for (int i = 0; i < 10; i++) {
        //    System.out.print((a1 + d * i) + " ");
        //}
        // 2 вариант
        int[] progression = new int[10];
        // записываем первый элемент прогрессии как элемент массива с индексом 0
        progression[0] = a1;
        for (int i = 1; i < 10; i++) {
            // считаем каждый элемент прогрессии как предыдущий + шаг
            progression[i] = progression[i - 1] + d;
        }
        // выводим массив с прогрессией
        for (int i = 0; i < 10; i++) {
            System.out.print(progression[i] + " ");
        }

    }
}
