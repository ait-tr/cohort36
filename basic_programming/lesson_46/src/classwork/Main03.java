package classwork;

import java.util.Random;
import java.util.Scanner;

public class Main03 {
    /*
    Сгенерировать массив из случайных чисел в диапазоне от 1 до 50 (10 элементов)
    Спросить у пользователя число
    Вывести индекс элемента, значение которого совпадает с введенным числом
     */

    public static void main(String[] args) {
        // создаем массив
        int[] array = new int[10];
        // создаем рандом чтобы генерировать массив
        Random random = new Random();
        // заполняем массив
        for (int i = 0; i < array.length; i++) {
            // случайными значениями от 1 до 50
            array[i] = 1 + random.nextInt(50 - 1);
        }
        // снова проходим по массиву чтобы вывести его
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        // создаем сканнер чтобы читать из консоли
        Scanner scanner = new Scanner(System.in);
        // читаем число, которое будем искать в массиве
        int n = scanner.nextInt();
        // заведомо неправильный индекс, по которому мы сможем определить что ничего не нашли
        int index = -1;
        // проходимся по массиву
        for (int i = 0; i < array.length; i++) {
            // если значения элемента совпадают с искомым
            if (array[i] == n) {
                // сохраняем его индекс
                index = i;
                // прекращаем выполнение цикла
                break;
            }
        }
        // если нашли элемент, выводим индекс
        if (index != -1) {
            System.out.println("Индекс введенного числа: " + index);
        }
    }
}
