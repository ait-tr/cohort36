package classwork.last_homework;

import java.util.Scanner;

public class Main03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Please, enter a number from 1 to 10!");
            number = scanner.nextInt();
        } while (number < 1 || number > 10);
        System.out.println("You input: " + number + ". " + "Thank you!");
    }
}
