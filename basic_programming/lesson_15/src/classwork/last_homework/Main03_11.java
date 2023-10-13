package classwork.last_homework;

import java.util.Scanner;

public class Main03_11 {

    /**
     * Метод, который считает сумму элементов массива arr с размером amount
     *
     * Параметры служат для того чтобы можно было выполнять одни и те же действия над разными переменными
     * при этом не изменяя сами параметры
     *
     * Написали после слова static слово int чтобы обозначить, что метод будет иметь целочисленный результат выполнения
     * В скобках пишем переменные-параметры (см. конспект урока 14)
     * @param arr - параметр целочисленный массив. Может быть массивом любого размера, главное чтобы был типа int
     * @param amount - параметр количество элементов массива. Если задать больше чем размер массива, будет ошибка
     * @return - возвращает сумму элементов массива
     */
    public static int sum(int[] arr, int amount) {
        // переменная куда мы будем записывать результат сложения
        int res = 0;
        // проходимся по всему массиву
        for (int i = 0; i < amount; i++) {
            // прибавляем элементы к переменной-результату
            res += arr[i];
        }
        // вернуть переменную как результат выполнения метода
        return res;
    }

    /**
     * Печатает список дел с минутами
     * @param list список дел
     * @param minutes список минут в соответствии с делами
     * @param amount количество дел
     */
    public static void printNumberedList(String[] list, int[] minutes, int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.println((i + 1) + ". " + list[i] + "(" + minutes[i] + "m)");
        }
        System.out.println("Общее количество времени: " + sum(minutes, amount) + "m");
    }

    /**
     * Метод который считывает ввод пользователя из консоли и записывает это в массив
     * @param list список дел
     * @param minutes список времени для дел
     * @param maxAmount максимальное количество дел в списке
     * @return количество дел, которое реально ввел пользователь
     */
    public static int readInputToList(String[] list, int[] minutes, int maxAmount) {
        // временная строка чтобы записывать в нее и проверять на слово "конец"
        String line;
        // счетчик дел
        int counter = 0;
        Scanner scanner = new Scanner(System.in);
        while (counter < maxAmount) {
            // считать строку
            line = scanner.nextLine();
            // если ввели конец, закончить цикл
            if (line.equals("конец")) {
                break;
            }
            // записываем в массив данные
            list[counter] = line;
            minutes[counter] = scanner.nextInt();
            // "поглощаем" спецсимвол переноса на новую строку
            scanner.nextLine();
            counter++;
        }
        // как результат работы метода возвращаем количество дел
        return counter;
    }

    public static void main(String[] args) {
        int maxAmount = 10;
        String[] toDoList = new String[maxAmount];
        int[] minutes = new int[maxAmount];
        // вызываем метод чтения из консоли, передаем ему все нужные аргументы. Потом записываем результат работы этого метода в переменную
        int counter = readInputToList(toDoList, minutes, maxAmount);
        // вызываем метод печати в консоль. Он ничего не возвращает, поэтому не записываем результат работы никуда
        printNumberedList(toDoList, minutes, counter);
    }
}
