package classwork.last_homework;

import java.util.Scanner;

public class Main02_11 {

    public static void printNumberedList(String[] list, int amount) {
        // Объявление метода printNumberedList, который принимает массив строк и количество элементов в массиве.
        for (int i = 0; i < amount; i++) { // Начало цикла for для перебора элементов массива.
            System.out.println((i + 1) + ". " + list[i]); // Вывод на экран элементов массива с номером.
        }
    }
    public static int readInputToList(String[] list, int maxAmount) {
        // Объявление метода readInputToList, который принимает массив строк и максимальное количество элементов.
        String line; // Объявление переменной line для хранения введенной строки.
        int counter = 0; // Объявление переменной counter для подсчета количества введенных строк.
        Scanner scanner = new Scanner(System.in); // Создание объекта Scanner для считывания ввода с клавиатуры.
        while(counter < maxAmount) { // Начало цикла while, который выполняется, пока не достигнуто максимальное количество элементов.
            line = scanner.nextLine(); // Считывание строки с клавиатуры и сохранение в переменной line.
            if (line.equals("конец")) { // Проверка, если введена строка “конец“, то выход из цикла.
                break;
            }
            list[counter] = line; // Сохранение введенной строки в массиве list.
            counter++; // Увеличение счетчика на 1.
        }
        return counter; // Возврат количества введенных строк.
    }
    public static void main(String[] args) {
        // Объявление метода main, который является точкой входа в программу.
        int maxAmount = 10; // Объявление переменной maxAmount с максимальным количеством элементов.
        String[] toDolist = new String[maxAmount]; // Создание массива строк toDolist с максимальным количеством элементов.
        int counter = readInputToList(toDolist, maxAmount); // Вызов метода для ввода строк и получение количества введенных строк.
        printNumberedList(toDolist, counter); // Вызов метода для вывода номеров и введенных строк.
    }
}

/*

Постирать штору
    Покормить кота
    Сделать домашнее задание
    Погулять
 */