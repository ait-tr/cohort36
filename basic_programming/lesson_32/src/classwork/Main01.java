package classwork;

import java.util.Scanner;

public class Main01 {
    /*
    Считать ввод пользователя
    Пользователь должен ввести отрицательное число
    Если пользователь вводит неверное число, нужно переспросить
    Программа не должна закочиться, пока не будет введено правильное число
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Enter negative number:");
            number = scanner.nextInt();
        } while (number >= 0);
        System.out.println("Correct!");
        /*
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        while (number >= 0) {
            System.out.println("Repeat!");
            number = scanner.nextInt();
        }
        System.out.println("Correct!");
         */
    }
}
