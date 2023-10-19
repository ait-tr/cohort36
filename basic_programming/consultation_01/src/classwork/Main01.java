package classwork;

import java.util.Scanner;

public class Main01 {

    public static int readUserInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void printNumberSign(boolean isPositive) {
        if (isPositive) {
            System.out.println("Number is positive!");
        } else {
            System.out.println("Number is negative!");
        }
    }

    public static void main(String[] args) {
        int number = readUserInput();
        boolean isPositive = number > 0;
        // if () {} else {}
        // System.out.println("Number is " + (isPositive ? "positive" : "negative"));
        printNumberSign(isPositive);


    }
}
