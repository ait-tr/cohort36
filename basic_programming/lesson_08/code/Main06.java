package classwork;

import java.util.Scanner;

/**
 * 9/27/2023
 * lesson_08
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main06 {
    // Пусть на вход подается "потенциально бесконечная" последовательность положительных целых чисел
    // Мы точно знаем, что последний член последовательности равен -1
    // 5, 8, 9, 10, 358, 11, 2, -1
    // нужно посчитать количество четных чисел
    // например для последовательности выше - это 4
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int evenNumbersCount = 0; // переменная для количества четных чисел

        int currentNumber = scanner.nextInt(); // считываем первое число

        while (currentNumber != -1) { // пока не наткнулись на последнее число

            if (currentNumber % 2 == 0) { // если число - четное, т.е. остаток от деления на 2 - 0
                evenNumbersCount = evenNumbersCount + 1; // увеличиваем переменную, которая хранит количество четных чисел
            }

            currentNumber = scanner.nextInt(); // считываем новое число из последовательности

        }
        // как только прочитали -1, то цикл завершается и мы попадаем сюда
        // печатаем количество четных чисел
        System.out.println(evenNumbersCount);
    }

}
