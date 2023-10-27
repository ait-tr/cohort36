package classwork.last_homework;

import java.util.Scanner;

public class Main02_18 {


    public static int askNumber(String message, int min, int max) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            // выводим сообщение
            System.out.println(message);
            // читаем ввод
            number = scanner.nextInt();
            // повторяем пока число не в заданых границах
        } while (number < min || number > max);
        return number;
    }

    public static void main(String[] args) {
        int pin;
        while (true) {
            // вызываем метод ввода числа
            pin = askNumber("Enter pin: ", 1000, 9999);
            if (pin != 8956) {
                // если неправильно ввели, говорим что неверный пин
                System.out.println("Incorrect pin!");
            } else {
                // если пин правильный, прекращаем выполнение цикла
                break;
            }
        }
        System.out.println("Correct pin! Thanks");
    }
}
