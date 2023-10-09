package classwork;

import java.util.Scanner;

public class Main03 {
    /*
    Вывести простые числа до числа которое введет пользователь
    1 2 3 5 7 11 13 17 23
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input natural number: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("You inputted not a natural number!");
            return;
        }

        for (int i = 1; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }

    }
}
