package classwork;

import java.util.Scanner;
import java.util.function.Function;

public class Main05 {
    public static void main(String[] args) {
        Function<String, String> greetingFactory = s -> "Hello, " + s + "!";

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();

        String greeting = greetingFactory.apply(name);

        System.out.println(greeting);
    }
}
