package classwork;

import java.util.Scanner;

public class Main02 {
    /*
    Прочитать ввод пользователя, но спрашивать еще раз, пока пользователь не введет число от 1 до 10
     */

    public static int readInput() {
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            System.out.println("Enter number from 1 to 10");
            int n = scanner.nextInt();
            // если введено число которое больше равно 1 И меньше равно 10, вернуть это число
            if (1 <= n && n <= 10) {
                return n;
            }
        }
    }

    public static void main(String[] args) {
        // вызываем метод
        int n = readInput();
        System.out.println("Вы ввели число " + n);
    }
}
