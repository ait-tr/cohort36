package classwork.last_homework.fun;

import java.util.Scanner;

public class Main01_12 {
    public static int askAmount() {
        System.out.println("Input amount of elements: ");
        return new Scanner(System.in).nextInt();
    }

    public static int[] generateFibonacciSequence(int amount) {
        int[] arr = new int[amount];
        for (int i = 0; i < arr.length; i++)
            arr[i] = i < 2 ?  i : arr[i - 1] + arr[i - 2];
        return arr;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + (i == arr.length - 1 ? "" : ", "));
    }

    public static void main(String[] args) {
        printArray(generateFibonacciSequence(askAmount()));
    }
}
