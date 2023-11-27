package classwork.last_homework;

import java.util.Random;
import java.util.Scanner;

public class Main02_31 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        Random random = new Random();
        if (amount == 1) {
            System.out.println(1 + random.nextInt(6));
        } else if (amount == 2) {
            System.out.println(1 + random.nextInt(6));
            System.out.println(1 + random.nextInt(6));
        } else {
            System.out.println("I dont have that amount of dice");
        }
    }
}
