package classwork.last_homework;

import java.util.Arrays;
import java.util.Random;

public class Main01_20 {

    public static int[] generateArray(int length, int min, int max) {
        Random random = new Random();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = min + random.nextInt(max - min);
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println("Array of 8 elements from 10 to 20: " + Arrays.toString(generateArray(8, 10, 20)));
    }
}
