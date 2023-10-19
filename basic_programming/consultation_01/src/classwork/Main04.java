package classwork;

import java.util.Random;

public class Main04 {

    public static int getRandomNumber() {
        Random random = new Random();
        // Нельзя вернуть тип строки, потому что в методе указано, что должен возвращаться целочисленный тип
        // return "Hello!";
        return random.nextInt(100);
    }

    public static void main(String[] args) {
        System.out.println(getRandomNumber());
    }
}
