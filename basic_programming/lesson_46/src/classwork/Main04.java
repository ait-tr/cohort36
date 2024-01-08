package classwork;

import java.util.Random;
import java.util.Scanner;

public class Main04 {
    /*
    Сгенерировать массив из случайных чисел в диапазоне от 1 до 50 (10 элементов)
    Спросить у пользователя число
    Вывести индекс элемента, значение которого совпадает с введенным числом
    Перемешать элементы случайным образом. В перемешанном массиве найти элемент еще раз
     */

    public static int[] generateRandomArray(int length, int min, int max) {
        // создаем массив, который будем генерировать
        int[] array = new int[length];
        // создаем рандом
        Random random = new Random();
        // проходимся по всем элементам
        for (int i = 0; i < array.length; i++) {
            // и заполняем их случайными значениями в заданом диапазоне
            array[i] = min + random.nextInt(max - min + 1);
        }
        // возвращаем массив
        return array;
    }

    public static void print(int[] array) {
        // проходимся по массиву
        for (int i = 0; i < array.length; i++) {
            // выводим каждый элемент
            System.out.print(array[i] + " ");
        }
    }

    public static int find(int[] array, int element) {
        // стандартный линейный поиск
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public static void shuffle(int[] array) {
        // создаем рандом чтобы перемешать случайным образом
        Random random = new Random();
        // проходим по всем элементам переданного массива
        for (int i = 0; i < array.length; i++) {
            // генерируем индекс элемента с которым будем менять местами текущий элемент
            int index = random.nextInt(array.length);
            // меняем местами значения элементов (swap)
            int temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String[] args) {
        // создаем массив
        int[] array = generateRandomArray(10, 1, 50);
        // печатаем массив
        print(array);
        // создаем сканнер и читаем число
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        // находим индекс элемента
        int index = find(array, n);
        // если нашли, выводим
        if (index != -1) {
            System.out.println("Индекс введенного числа: " + index);
        }
        // перемешаем массив
        shuffle(array);
        // выведем на экран
        print(array);
        // снова находим индекс того же элемента
        index = find(array, n);
        // выводим если нашли
        if (index != -1) {
            System.out.println("Индекс введенного числа: " + index);
        }
    }
}
