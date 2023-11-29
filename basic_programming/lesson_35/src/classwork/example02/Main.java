package classwork.example02;

/*
Разработать класс "планета"
 */

public class Main {

    public static void printInfo(Planet planet) {
        System.out.println("Название: " + planet.getName());
        System.out.println("Тип: " + planet.getType());
        System.out.println("Биом: " + planet.getBiome());
        // intellegent beings
        System.out.println("Население: " + planet.getPopulation() + " разумных существ");
        System.out.println("Радиус: " + planet.getRadius() + " км");
        System.out.println("Масса: " + planet.getMass() + " мегатонн");

    }

    public static void main(String[] args) {
        // XeY === x * 10^Y
        Planet tatooine = new Planet("Tatooine", "Habitable", "Desert", 200_000, 5_232, (long) 4.9e15);
        printInfo(tatooine);
    }
}
