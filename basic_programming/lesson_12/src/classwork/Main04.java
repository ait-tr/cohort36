package classwork;

import java.util.Random;
import java.util.Scanner;

public class Main04 {
    /*
    Написать игру "Угадай число"
    Программа должна загадать число от 1 до 10
    Нужно попросить пользователя угадать число, если угадать, поздравить
    Если не угадал, вывести какое было число
     */
    public static void main(String[] args) {
        // ГСЧ
        Random random = new Random();
        // Нижняя граница значений, "от"
        int min = 1;
        // Верхняя граница значений, "до"
        int max = 10;
        // генерация числа с границами
        int number = min + random.nextInt(max - min);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Угадай число от 1 до 10");
        // читаем из консоли догадку пользователя
        int choice = scanner.nextInt();
        // проверяем угадал ли пользователь и выводим соответствующие сообщения
        if (choice == number) {
            System.out.println("Молодец! Ты угадал число!");
        } else {
            System.out.println("Не угадал! Число было " + number);
        }
    }
}
