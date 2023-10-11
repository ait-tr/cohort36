package classwork;

public class Main02 {

    public static void printGreeting() {
        System.out.println("Привет! Эта программа сейчас посчитает от 1 до 10");
    }

    public static void countOneToTen() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        // вызываем метод, который выведет приветствие
        printGreeting();
        // вызываем метод, который будет считать от 1 до 10
        countOneToTen();
        System.out.println("\nИ давайте еще раз!");
        // вызываем метод, который будет считать от 1 до 10 еще раз, чтобы снова вывести тоже самое
        countOneToTen();
    }
}
