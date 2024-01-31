package classwork;

import java.util.function.Consumer;

public class Main04 {
    public static void main(String[] args) {
        Consumer<String> printString = System.out::println;

        printString.accept("Hello world!");
    }
}
