package classwork;

public class Main02 {
    public static void main(String[] args) {
        Runnable helloFunction = () -> System.out.println("Hello world!");
        helloFunction.run();
    }
}
