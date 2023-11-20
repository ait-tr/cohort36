package classwork;

import java.util.Random;
import java.util.Scanner;

public class Main05 {
    /*
    Написать игру "угадай число"
    Программа загадывает число от 1 до 100
    Пользователь угадывает, и программа говорит тепло либо холодно
    Если число отличается не больше чем на 5, говорим жарко
    Если число отличается не больше чем на 15, говорим тепло
    Если число отличается не больше чем на 25, говорим нормально
    Если число отличается больше чем на 25, говорим холодно
    Когда число угадано программа должна закончиться
     */
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int number = 1 + random.nextInt(100 - 1);

        while (true) {
            int input = scanner.nextInt();

            if (number == input) {
                break;
            } else if (Math.abs(number - input) <= 5) {
                System.out.println("Жарко");
            } else if (Math.abs(number - input) <= 15) {
                System.out.println("Тепло");
            } else if (Math.abs(number - input) <= 25) {
                System.out.println("Нормально");
            } else {
                System.out.println("Холодно");
            }
        }
    }
}
