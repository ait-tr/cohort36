package classwork.last_homework;

import java.util.Arrays;
import java.util.Random;

public class Main02_20 {
    public static int[] generateArray(int length, int min, int max) {
        Random random = new Random();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = min + random.nextInt(max - min);
        }
        return arr;
    }

    public static void reverseArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = generateArray(10, 1, 100);
        System.out.println(Arrays.toString(arr));
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
