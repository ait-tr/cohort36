package classwork;

public class Main04 {

    public static void sayHello() {
        System.out.println("Hello world!");
    }

    public static void main(String[] args) {
        Runnable method = Main04::sayHello;

        method.run();
    }
}
