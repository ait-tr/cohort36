package classwork.example01;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> greetings = new ArrayList<>();

        greetings.add("Hello");
        greetings.add("Hi");
        greetings.addAll(List.of("Good morning", "Good afternoon", "Good evening"));

        for (String s : greetings) {
            System.out.println(s + " world!");
        }
    }
}
