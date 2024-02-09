package classwork.last_homework;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main04 {
    public static void main(String[] args) {
        String str = "Java virtual machine"; // JVM

        str = Arrays.stream(str.split("\\s+"))
                .map(s -> Character.toString(s.charAt(0)).toUpperCase())
                .collect(Collectors.joining());
        System.out.println(str);
    }
}
