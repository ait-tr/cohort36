package classwork.last_homework;

import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        // цикл с пост-условием - чтобы не повторять код
        do {
            System.out.println("Enter natural number");
            number = scanner.nextInt();
        } while (number <= 0);

        System.out.println("Your natural number: " + number);

    }
}
