import java.util.Random;

/**
 * 9/20/2023
 * lesson_06
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main02 {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt(100));
        String s1 = new String("Marsel");
        String s2 = new String("Marsel");

        System.out.println(s1 == s2); // false

//        int i = 5;
//        int j = 5;
//        System.out.println(i == j); // true


    }
}
