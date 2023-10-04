package classwork.last_homework;

import java.util.Scanner;

public class Main04 {
    public static void main(String[] args) {
        // массив со случайными значениями
        int[] arr = {1, 4, 8, 6, 2, 1, 3, 7, 77, 51};
        // Выводим массив
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        Scanner scanner = new Scanner(System.in);

        int value = scanner.nextInt();
        // алгоритм линейного поиска, для того чтобы найти элемент массива с таким значением, как ввел пользователь
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (value == arr[i]) {
                index = i;
                break;
            }
        }
        // вывод результата
        if (index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Index is: " + index);
        }
    }
}
