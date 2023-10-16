package classwork.last_homework;

import java.util.Random;
import java.util.Scanner;

public class Main02_12 {

    // спрашивает количество элементов
    public static int askAmount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input amount of elements: ");
        return scanner.nextInt();
    }

    // генерирует массив случайных значений заданной длинны
    public static int[] getRandomArray(int amount) {
        Random random = new Random();
        int min = 0;
        int max = 100;
        int[] arr = new int[amount];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = min + random.nextInt(max - min);
        }
        return arr;
    }

    // дает все начальные данные для программы
    public static int[] getInitialData() {
        int amount = askAmount();
        return getRandomArray(amount);
    }

    // выводит массив в консоль
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + (i == arr.length - 1 ? "" : ", "));
        }
    }

    // сортирует массив
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[index] > arr[j]) {
                    index = j;
                }
            }
            if (index == i) {
                continue;
            }
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = getInitialData();
        System.out.println("Before sorting");
        printArray(arr);
        sort(arr);
        System.out.println("\nAfter sorting");
        printArray(arr);
    }
}
