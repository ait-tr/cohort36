package classwork.last_homework;

import java.util.Scanner;

public class Main04 {
    /*
    Локальный максимум - число которое больше своих соседей
    1 3 4 2 5 6 7 11 8 9
    Локальные максимумы - 4 и 11
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        // как и в прошлых заданиях, заполним массив значениями изпользуя ввод пользователя
        for (int i = 0; i < 10; i++) {
            arr[i] = scanner.nextInt();
        }
        // amount - количество
        int amount = 0;
        for (int i = 1; i < 9; i++) {
            // проверяем будет ли наш элемент больше предыдущего
            // следующие два вложенных условных оператора можно заменить на один:
            // if (arr[i-1] < arr[i] && arr[i] > arr[i + 1])
            if (arr[i-1] < arr[i]) {
                // проверяем будет ли наш элемент больше следующего
                if (arr[i] > arr[i + 1]) {
                    // увеличиваем количество найденных максимумов
                    amount++;
                    //System.out.println("Локальный максимум: " + arr[i]);
                }
            }
        }
        // выводим результат
        System.out.println(amount);
    }
}
