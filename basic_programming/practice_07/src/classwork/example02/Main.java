package classwork.example02;

import java.util.Scanner;

public class Main {
    /*
    написать программу, которая складывает два числа, но только если попросить "пожалуйста"
    Если пользователь не попросил так как нужно, создать исключительную ситуацию, из-за которой программа больше не будет работать
     */

    public static void main(String[] args) {
        System.out.println("Hello, enter two numbers to add please: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String s = scanner.nextLine();
        if (!s.contains("please")) {
            throw new RudeRequestException("You didnt ask politely!");
        }
        System.out.println("Sure, the sum is: " + (a + b));
    }
}
