package classwork.last_homework;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static Player pickClass(int pick) {
        //Значения атаки, здоровья и уникальных полей для объектов игрока указать фиксированными числами в коде.
        switch (pick) {
            case 1:
                return new Mage("", 15, 3, 5);
            case 2:
                return new Warrior("", 12, 4, 4);
            case 3:
                return new Archer("", 15, 4);
        }
        return null;
    }

    public static void fight(Player player, Monster monster) {
        Scanner scanner = new Scanner(System.in);
        //Сражение происходит до тех пор, пока монстр не будет повержен
        while (true) {
            // игрок и монстр по очереди атакуют друг друга.
            player.attack(monster);
            if (!monster.isAlive()) {
                //(вывести сообщение о выигрыше в таком случае),
                System.out.println("You won!");
                break;
            }
            monster.attack(player);
            if (!player.isAlive()) {
                //либо пока игрок не будет убит (вывести сообщение о проигрыше в таком случае).
                System.out.println("You lost!");
                break;
            }
            // После каждого обмена ударами должен выводиться вопрос "продолжить сражение?".
            System.out.println("Continue fight?");
            String answer = scanner.next();
            if (answer.equals("no")) {
                System.out.println("Draw!");
                break;
            }
        }
    }

    public static void main(String[] args) {
        //В начале спросить у пользователя, какой боевой класс он хочет выбрать (цифра от 1 до 3)
        System.out.println("Choose your class");
        System.out.println("1. Mage");
        System.out.println("2. Warrior");
        System.out.println("3. Archer");
        Scanner scanner = new Scanner(System.in);

        int pick = scanner.nextInt();
        //Создать переменную класса Player, инициализировать объектом соответствующего класса (маг, воин или лучник).
        Player player = pickClass(pick);
        //Далее спросить имя игрока.
        System.out.println("Enter your name: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        player.setName(name);
        Random random = new Random();
        //Также создать монстра, с которым игрок будет сражаться.
        //В качестве атаки и здоровья монстра указать случайные числа в диапазоне от 1 до 20.
        // Исправили до 10 урона для баланса
        Monster monster = new Monster("",
                random.nextInt(20) + 1, random.nextInt(10) + 1);
        System.out.println(player);
        System.out.println(monster);
        System.out.println("Fight begins!");
        fight(player, monster);
    }
}
