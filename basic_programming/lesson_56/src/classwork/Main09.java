package classwork;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main09 {
    public static void main(String[] args) {
        int[] arr = { 4, 8, -5, 1, 3, -1, 654, -21, 324, -16, 564, 65, -165, 16, 51, -65 };

        String res = "[ " +
                Arrays.stream(arr)
                .boxed()
                .map(String::valueOf)
                .collect(Collectors.joining(", "))
                + " ]";
        System.out.println(res);
    }
}
