package classwork;

import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        // простой пример различия между return и break
        Scanner scanner = new Scanner(System.in);
        // этот цикл будет выполняться бесконечно - поэтому нужно внутри предусмотреть способ выхода
        while (true) {
            System.out.println("Введите 1 чтобы закончить программу или 0 чтобы закончить цикл");
            int answer = scanner.nextInt();
            if (answer == 0) {
                // return заканчивает выполнение метода. В этой строке закончится выполнение всей программы
                return;
            } else if (answer == 1) {
                // break закончит только выполнение цикла. В этой строке закончится только цикл, а программа продолжит работать
                break;
            } else if (answer == 2) {
                // continue закончит только текущую итерацию. В этой строке закончится только текущая итерация, и цикл продолжит работу
                continue;
            }
            System.out.println("Вы ввели неправильное число!");
        }
        System.out.println("Цикл окончен! Хорошего дня!");
    }
}
