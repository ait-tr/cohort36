package classwork.last_homework;

import java.util.Scanner;

// в этом классе все точно так же, изменения только в двух методах в начале класса
public class Main04_11 {

    /**
     * Метод который находит максимальное значение в массиве
     * @param arr массив в котором надо искать значение
     * @param amount количество элементов массива
     * @return индекс самого большого элемента
     */
    public static int findMax(int[] arr, int amount) {
        int index = 0;
        for (int i = 0; i < amount; i++) {
            if (arr[i] > arr[index]) {
                index = i;
            }
        }
        return index;
    }

    public static void printNumberedList(String[] list, int[] minutes, int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.println((i + 1) + ". " + list[i] + " (" + minutes[i] + "m)");
        }
        System.out.println("Общее количество времени: " + sum(minutes, amount) + "m");
        // вывываем метод findMax, в качестве аргументов передаем массив минут и наше количество элементов
        // результат работы этого метода записываем в переменную, чтобы использовать в следующей строке
        int index = findMax(minutes, amount);
        System.out.println("Самое долгое дело: " + list[index] + " (" + minutes[index] + "m)");
    }

    public static int sum(int[] arr, int amount) {
        int res = 0;
        for (int i = 0; i < amount; i++) {
            res += arr[i];
        }
        return res;
    }

    public static int readInputToList(String[] list, int[] minutes, int maxAmount) {
        String line;
        int counter = 0;
        Scanner scanner = new Scanner(System.in);
        while (counter < maxAmount) {
            line = scanner.nextLine();
            if (line.equals("конец")) {
                break;
            }
            list[counter] = line;
            minutes[counter] = scanner.nextInt();
            scanner.nextLine();
            counter++;
        }
        return counter;
    }

    public static void main(String[] args) {
        int maxAmount = 10;
        String[] toDoList = new String[maxAmount];
        int[] minutes = new int[maxAmount];
        int counter = readInputToList(toDoList, minutes, maxAmount);
        printNumberedList(toDoList, minutes, counter);
    }
}
