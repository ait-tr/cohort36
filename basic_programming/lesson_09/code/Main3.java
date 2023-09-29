package classwork;

import java.util.Scanner;

/**
 * 9/29/2023
 * lesson_09
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // объявили сканнер для чтения

        double[] days = new double[6]; // создали массив из трех переменных (правильно - элементов)

        int i; // завели переменную-счетчик

        i = 0; // обнуляем счетчик

        while (i < 6) { // пока значение этой переменной меньше 6

            days[i] = scanner.nextDouble(); // считываем значение i-ого элемента массива
            // days[0], days[1], days[2]

            i = i + 1; // увеличиваем i на один
        }

        double sumOfElements = 0; // готовим переменную для суммы всех элементов

        i = 0; // обнуляем счетчик

        while (i < 6) { // пока i меньше 6
            sumOfElements = sumOfElements + days[i]; // кидаем i-ый элемент в сумму
            // sumOfElements = sumOfElements + days[0]
            // sumOfElements = sumOfElements + days[1]
            // sumOfElements = sumOfElements + days[2]

            i = i + 1; // увеличиваем i
        }

        double average = sumOfElements / 6; // делим сумму всех элементов на общее их количество

        System.out.println(average); // печатаем среднее
    }
}
