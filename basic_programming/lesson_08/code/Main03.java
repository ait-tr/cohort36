package classwork;


import java.util.Scanner;

/**
 * 9/27/2023
 * lesson_08
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main03 {
    public static void main(String[] args) {
        // распечатать числа от from до to
        // from = 5, to = 10
        // 5, 6, 7, 8, 9, 10

        Scanner scanner = new Scanner(System.in);

        double from = scanner.nextInt();
        double to = scanner.nextInt();

        double i = from;

        while (i <= to) {
            System.out.println(i);
            i = i + 0.5;
        }
    }
}
