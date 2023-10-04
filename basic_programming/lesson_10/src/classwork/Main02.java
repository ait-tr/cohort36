package classwork;

import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 9");

        int input = scanner.nextInt();

        if ((input > 9) || (input < 1)) {
            System.out.println("Значение вне диапазона");
            return;
        }
        //Строит верхнюю часть пирамиды
        for (int i = 1; i <= input; i++) {
            int j = 1;
            while (j <= i) {
                System.out.print(j);
                j++;
            }
            System.out.println();
        }
        // Строит нижнюю часть пирамиды
        for (int i = input - 1; i >= 1; i--) {
            int j = 1;
            while (j <= i) {
                System.out.print(j);
                j++;
            }
            System.out.println();
        }
    }
}

