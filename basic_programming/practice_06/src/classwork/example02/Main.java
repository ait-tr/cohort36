package classwork.example02;

import classwork.example01.package2.ConsoleReader;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int a = ConsoleReader.readInt();
        try {
            if (a < 0) {
                throw new IOException("Goodbye world!");
            }
            if (a > 0) {
                throw new IllegalArgumentException("Hello");
            }
        } catch (IOException | IllegalArgumentException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("We finished our program");
        }
        System.out.println("Program ended");

    }
}
