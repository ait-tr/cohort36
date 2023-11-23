package classwork;

import java.util.Random;

public class Main03 {

    /*
    В массиве из 10 случайных элементов в диапазоне 0~10,
    Посчитать количество четных и не четных элементов и их суммы
     */
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
            System.out.print(arr[i] + " ");
        }

        int sumEven = 0;
        int sumOdd = 0;
        int countEven = 0;
        int countOdd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sumEven += arr[i];
                countEven++;
            } else {
                sumOdd += arr[i];
                countOdd++;
            }
        }
        System.out.println();
        System.out.println("Sum even: " + sumEven);
        System.out.println("Sum odd: " + sumOdd);
        System.out.println("Count even: " + countEven);
        System.out.println("Count odd: " + countOdd);
    }
}
