package classwork;

import java.util.Scanner;

/**
 * 9/29/2023
 * lesson_09
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] array = new int[5]; // объявили массив из 5 элементов

        // кладем значения в массив
        array[0] = 3;
        array[1] = 5;
        array[2] = -10;
        array[3] = 11;
        array[4] = 15;

        int i; // объявили переменную-счетчик

        i = 0; // начальное значение

        while (i < 5) {
            // распечатать i-ый элемент
            System.out.println(array[i]); // array[0], array[1], array[2] и т.д.

            i = i + 1;
        }

        // посчитаем сумму элементов

        int sum = 0; // необходимо объявить переменную для хранения суммы элементов

        i = 0; // поскольку i = 5, мы должны опять обнулить

        while (i < 5) {
            sum = sum + array[i]; // кладем элемент в сумму

            i = i + 1;
        }

        System.out.println(sum);
    }
}
