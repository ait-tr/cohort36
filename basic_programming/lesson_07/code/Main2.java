package classwork;

import java.util.Scanner;

/**
 * 9/22/2023
 * lesson_07
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s1 = scanner.nextLine(); // new String()
        String s2 = scanner.nextLine(); // new String()

        System.out.println(s1 == s2); // false
    }
}
