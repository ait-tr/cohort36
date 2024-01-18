package classwork.example01.package1;

import classwork.example01.package2.ConsoleReader;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter two values");
        int a = ConsoleReader.readInt();
        int b = ConsoleReader.readInt();
        System.out.println(a + " + " + b + " = " + (a + b));
    }
}
