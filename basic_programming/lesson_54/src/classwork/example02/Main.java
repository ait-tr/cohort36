package classwork.example02;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> greetings = new LinkedList<>();

        greetings.add("Hello");
        greetings.add("Hi");
        greetings.addAll(List.of("Good morning", "Good afternoon", "Good evening"));

        while (!greetings.isEmpty()) {
            String elem = greetings.poll();
            System.out.println(elem + " world!");
        }

    }
}
