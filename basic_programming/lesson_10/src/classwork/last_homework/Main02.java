package classwork.last_homework;

import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // arr = array = массив
        int[] arr = new int[5];
        // выполняем код столько раз, сколько у нас элементов массива
        for (int i = 0; i < 5; i = i + 1) {
            // считываем ввод пользователя и записываем в массив
            arr[i] = scanner.nextInt();
        }
        // проходим по всему массиву еще раз
        for (int i = 0; i < 5; i = i + 1) {
            // если значение элемента парное
            if (arr[i] % 2 == 0) {
                // то вывести этот элемент в консоль
                System.out.println(arr[i]);
            }
        }

    }
}
