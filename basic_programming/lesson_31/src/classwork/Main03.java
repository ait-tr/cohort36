package classwork;

import java.util.Scanner;

public class Main03 {
    /*
    Спросить у пользователя число, вывести сообщение "Число подходит"
    если число находится в промежутке от 10 до 100, либо делится на 4 нацело
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if ((number >= 10 && number <= 100) || number % 4 == 0) {
            System.out.println("Число подходит");
        }
    }
}
