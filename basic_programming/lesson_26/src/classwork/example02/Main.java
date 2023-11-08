package classwork.example02;

public class Main {
    // это обычная константа
    public static final String MESSAGE_TEXT = "Message: ";

    public static void printMessage(String message) {
        System.out.println(Main.MESSAGE_TEXT + message);
    }

    public Main() {
        // это локальная константа
        final String message = "Hello";
        // статические методы класса можно легко вызывать из объектного контекста
        Main.printMessage(message);
    }

    public static void main(String[] args) {
        // создаем объект текущего класса чтобы перейти в объектный контекст
        Main main = new Main();
        // вот так можно использовать константы из других классов
        System.out.println("Pi number: " + Math.PI);
    }
}
