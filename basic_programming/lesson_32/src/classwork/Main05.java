package classwork;

import java.util.Scanner;

public class Main05 {
    /*
    Вывести в консоль квадрат из звездочек
    В начале программы спросить размер стороны квадрата у пользователя
     */
    public static void main(String[] args) {
        // (i, j, k)
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
