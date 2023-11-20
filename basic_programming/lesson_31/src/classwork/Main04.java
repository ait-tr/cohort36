package classwork;

import java.util.Scanner;

public class Main04 {
    /*
    Спросить число у пользователя
    Вывести "Подходит" если число не находится в диапазоне от 0 до 10
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number < 0 || number > 10) {
            System.out.println("Подходит");
        }
    }
}
