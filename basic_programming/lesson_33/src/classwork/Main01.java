package classwork;

public class Main01 {
/*
написать метод, который напечатает массив в консоль
 */

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 9, 1, -5, 3, 8};
        print(arr);
    }
}
