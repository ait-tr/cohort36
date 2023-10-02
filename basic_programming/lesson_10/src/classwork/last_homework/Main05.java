package classwork.last_homework;

import java.util.Scanner;

public class Main05 {
    // array reversal algorithm - алгоритм разворота массива
    /*
    Разворачиваем правильно:
    1 3 5 8 9
    9 8 5 3 1
    Неправильно:
    9 8 5 8 9
    */

    // магическое число - это число, которое необоснованно (без причины и объяснения) находится в коде
    // Примечание: более правильный вариант выполнения этого задания находится в classwork.Main01
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        // считываем массив с ввода пользователя
        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextInt();
        }
        // создаем временный массив, в который будем записывать свой перевернутый массив, чтобы не потерять данные
        int[] tempArr = new int[5];
        // пройдем по всем элементам массива
        for (int i = 0; i < 5; i++) {
            // запишем в текущий элемент временного массива элемент с таким же индексом, но с конца
            tempArr[i] = arr[5 - i - 1];
        }
        // заменим значение в arr на то что в tempArr
        arr = tempArr;
        // вывод массива на экран
        for (int i = 0; i < 5; i = i + 1) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }
}
