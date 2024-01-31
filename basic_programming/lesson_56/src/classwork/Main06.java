package classwork;

import java.util.Scanner;
import java.util.function.Predicate;

public class Main06 {
    public static void main(String[] args) {
        Predicate<String> isLongEnoughPassword = s -> s.length() >= 8;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your password: ");
        String password = scanner.next();

        if (isLongEnoughPassword.test(password)) {
            System.out.println("This password is long enough!");
        } else {
            System.out.println("This password is NOT long enough!");
        }

    }
}
