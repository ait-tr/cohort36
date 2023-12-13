package classwork.last_homework.homework39.task01;

import java.util.Scanner;

public class Main {

    /*
    Создать метод, который идентифицирует введенный пользователем металл
     */

    public static Metal identifyMetal(Metal someMetal) {
        Metal[] metals = {
                new Metal("Silver", 962, "White", 10.49, true),
                new Metal("Gold", 1064, "Yellow", 19.32, true),
                new Metal("Iron", 1538, "Gray", 7.87, false),
                new Metal("Copper", 1085, "Reddish", 8.96, true),
                new Metal("Aluminum", 660, "Silvery", 2.70, false),
                new Metal("Platinum", 1768, "Silver", 21.45, true),
                new Metal("Lead", 327, "Blueish", 11.34, false),
                new Metal("Nickel", 1455, "Metallic", 8.90, false),
                new Metal("Zinc", 419, "Bluish-white", 7.14, false),
                new Metal("Tin", 232, "Silver-white", 7.31, false)
        };

        for (int i = 0; i < metals.length; i++) {
            if (metals[i].equals(someMetal)) {
                return metals[i];
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Metal someMetal = new Metal();

        System.out.println("Enter name: ");
        someMetal.setName(scanner.nextLine());

        System.out.println("Enter melting temperature: ");
        someMetal.setMeltingTemperature(scanner.nextInt());

        scanner.nextLine();
        System.out.println("Enter color: ");
        someMetal.setColor(scanner.nextLine());

        System.out.println("Enter density: ");
        someMetal.setDensity(scanner.nextDouble());

        System.out.println("Enter 1 if its valuable and 0 if its not: ");
        someMetal.setValuable(scanner.nextInt() == 1);

        Metal identifiedMetal = identifyMetal(someMetal);
        // null-check
        System.out.println(identifiedMetal == null
                ? "Metal is not identified! There is no such metal"
                : "Metal identified!\n" + identifiedMetal);

    }
}
