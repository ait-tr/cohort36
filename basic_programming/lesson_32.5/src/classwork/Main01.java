package classwork;

import java.util.Random;
import java.util.Scanner;

public class Main01 {
    /*
    Посчитать сумму и произведение элементов массива на промежутке от A до B
    В массиве должно быть 10 случайных элементов в диапазоне 0~10
    Числа A и B вводит пользователь.
     */
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1 + random.nextInt(10);
            System.out.print(arr[i] + " ");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter A:");
        int a = scanner.nextInt();
        System.out.println("Enter B:");
        int b = scanner.nextInt();

        int sum = 0;
        int prod = 1;
        for (int i = a; i <= b; i++) {
            sum += arr[i];
            prod *= arr[i];
        }
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + prod);
    }
}
