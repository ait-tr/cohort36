package classwork;

import java.util.function.Supplier;

public class Main03 {
    public static void main(String[] args) {
        Supplier<String> helloStringSupplier = () -> "Hello world!";

        String s = helloStringSupplier.get();

        System.out.println(s);

    }
}
