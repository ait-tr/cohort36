package classwork;

public class Main01 {
    public static void sayHello() {
        System.out.println("Hello world!");
    }

    public static void main(String[] args) {
        Runnable method = Main01::sayHello;

        System.out.println("Running method from method reference: ");

        method.run();
    }
}
