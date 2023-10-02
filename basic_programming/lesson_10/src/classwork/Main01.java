package classwork;

import java.util.Scanner;

public class Main01 {
    // здесь - тот же код что и в classwork.last_homework.Main05
    // единственное отличие - вместо числового литерала в качестве размера использовано arr.length
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] tempArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            tempArr[i] = arr[arr.length - i - 1];
        }
        arr = tempArr;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
