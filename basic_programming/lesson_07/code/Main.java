package classwork;

/**
 * 9/22/2023
 * lesson_07
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main {
    public static void main(String[] args) {
        String s1 = new String("Hello");
        String s2 = new String("Hello");

        System.out.println(s1 == s2); // false, потому что разные объекты

        String s3 = "Hello";
        String s4 = "Hello";
        String s5 = "Hello";

        String s6 = "Bye";
        String s7 = "Bye";

        System.out.println(s3 == s4); // true, потому что литеральные строки (один и тот же объект)

        System.out.println(s1 == s4); // false, потому что разные объекты (один через new, другой - литеральный)
    }
}
