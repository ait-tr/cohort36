package classwork;

import java.util.HashSet;
import java.util.Set;

public class Main02 {
    /*
    Написать метод isPangram используя HashSet
     */

    public static boolean isPangram(String s) {
        s = s.toLowerCase().replaceAll("[^a-z]", "");
        Set<Character> letters = new HashSet<>();
        for (Character ch : s.toCharArray()) {
            letters.add(ch);
        }
        return letters.size() == 26;
    }

    public static void main(String[] args) {
        System.out.println(isPangram("Quick brown fox jumps over the lazy dog"));
        System.out.println(isPangram("Hello"));

    }
}
