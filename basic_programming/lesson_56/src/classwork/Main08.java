package classwork;

import java.util.Arrays;

public class Main08 {
    /*
    Подсчитать отрицательные числа в массиве
     */
    public static void main(String[] args) {
        int[] arr = { 4, 8, -5, 1, 3, -1, 654, -21, 324, -16, 564, 65, -165, 16, 51, -65 };

        long count = Arrays.stream(arr)
                        .filter(i -> i < 0)
                        .count();

        /*int count = 0;
        for (int i = 0; i < args.length; i++) {
            if (arr[i] < 0) {
                count++;
            }
        }*/
        System.out.println(count);
    }
}
