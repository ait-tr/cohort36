package classwork;

import java.util.Random;
import java.util.Scanner;

public class Main01 {

    /*
    В целочисленном массиве все числа приравнять к следующему ближайшему квадрату целого числа
     */
    // 1 2 3 4 5 6 7 8
    // 1 4 9 16 25 36 49 64
    /*
     4 61 9 12 5 34 10

     4 64 9 16 9 36 16
     */

    public static void toNextSquare(int[] arr) {
        // проходим по всему массиву
        for (int i = 0; i < arr.length; i++) {
            // если корень числа НЕ целое число:
            if (Math.sqrt(arr[i]) % 1 != 0) {
                // берем корень числа
                double num = Math.sqrt(arr[i]);
                // приводим корень числа к инт, чтобы потерять нецелую часть, прибавляем 1, и возводим в квадрат
                // таким образом, выполняем то что было запрошено в задании
                arr[i] = (int) Math.pow((int)(num) + 1, 2);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(new Random().nextInt(1, 41));
        int[] arr = {4, 61, 9, 12, 5, 34, 10};
        toNextSquare(arr);
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            // печатаем элемент
            System.out.print(arr[i]);
            // на всех итерациях кроме последней
            if (i != arr.length - 1) {
                // печатаем запятую
                System.out.print(", ");
            } else {
                // на последней, печатаем скобочку закрывающуюся
                System.out.println(" ]");
            }
        }
    }
}
