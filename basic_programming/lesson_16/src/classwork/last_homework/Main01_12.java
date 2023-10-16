package classwork.last_homework;

import java.util.Scanner;

public class Main01_12 {
    // спрашивает количество элементов
    public static int askAmount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input amount of elements: ");
        return scanner.nextInt();
    }

    // генерирует последовательность чисел Фибоначчи
    public static int[] generateFibonacciSequence(int amount) {
        int[] arr = new int[amount];

        for (int i = 0; i < arr.length; i++) {
            if (i < 2) {
                arr[i] = i;
                continue;
            }
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr;
    }

    // выводит массив на экран
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + (i == arr.length - 1 ? "" : ", "));
        }
    }

    public static void main(String[] args) {
        int amount = askAmount();
        int[] arr = generateFibonacciSequence(amount);

        printArray(arr);
    }
}
