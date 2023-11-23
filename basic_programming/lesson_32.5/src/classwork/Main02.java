package classwork;

import java.util.Random;

public class Main02 {

    /*
    В массиве из 10 случайных элементов в диапазоне -10~10,
    Вывести изначальный массив
    Заменить положительные элементы нулями, а отрицательные - их модулями
    Вывести результат
     */
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();
        int min = -10;
        int max = 10;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = min + random.nextInt(max - min);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] < 0 ? -arr[i] : 0;
            System.out.print(arr[i] + " ");
        }

    }
}
