package classwork.last_homework.task01_25;

public class Main {
    public static void main(String[] args) {
        // создаем первого человека
        Human jack = new Human();
        jack.name = "Jack";
        jack.age = 35;
        // создаем второго человека
        Human ellis = new Human();
        ellis.name = "Ellis";
        ellis.age = 28;
        // создаем третьего человека
        Human bob = new Human();
        bob.name = "Robert";
        bob.age = 31;
        // просим всех представиться по очереди
        jack.introduce();
        ellis.introduce();
        bob.introduce();
    }
}
