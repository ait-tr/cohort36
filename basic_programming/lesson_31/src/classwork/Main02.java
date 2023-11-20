package classwork;

import java.util.Scanner;

public class Main02 {
    /*
    Считать число у пользователя
    Проверить будет ли оно больше нуля и вывести сообщение об этом
    Если число меньше нуля, вывести другое сообщение
    Если число равно нулю, вывести сообщение что оно равно нулю
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number > 0) {
            System.out.println("Its positive!");
        } else if (number == 0) {
            System.out.println("Zero");
        } else {
            System.out.println("Its negative");
        }
    }
}
