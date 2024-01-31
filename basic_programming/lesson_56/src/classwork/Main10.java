package classwork;

import java.util.List;
import java.util.stream.Collectors;

public class Main10 {
    public static void main(String[] args) {
        List<Integer> list = List.of(4, 8, -5, 1, 3, -1, 654, -21, 324, -16, 564, 65, -165, 16, 51, -65);

        List<Integer> biggest = list.stream()
                .sorted((i1, i2) -> -Integer.compare(i1, i2))
                .limit(5)
                .collect(Collectors.toList());

        System.out.println(biggest);
    }
}
