package classwork.last_homework;

import java.util.Arrays;
import java.util.Random;

public class Main04_20 {
    public static int[] generateArray(int length, int min, int max) {
        Random random = new Random();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = min + random.nextInt(max - min);
        }
        return arr;
    }

    public static int[] doubleElements(int[] arr) {
        int[] res = new int[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            res[2 * i] = arr[i];
            res[2 * i + 1] = arr[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = generateArray(10, 1, 10);
        System.out.println(Arrays.toString(arr));
        arr = doubleElements(arr);
        System.out.println(Arrays.toString(arr));
    }
}
