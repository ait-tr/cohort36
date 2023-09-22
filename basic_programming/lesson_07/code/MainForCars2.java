import java.util.Scanner;

/**
 * 9/22/2023
 * lesson_06
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class MainForCars2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // объявили сканнер для чтения

        // создали первый объект автомобиля

        Car car1 = new Car();
        // положили значения переменных в поля этого автомобиля
        car1.model = scanner.nextLine();
        car1.color = scanner.nextLine();
        car1.mileage = scanner.nextInt();

        scanner.nextLine();

        Car car2 = new Car();
        // положили значения переменных в поля нового автомобиля
        car2.model = scanner.nextLine();
        car2.color = scanner.nextLine();
        car2.mileage = scanner.nextInt();

        car1.go();
        car2.go();

        System.out.println(car1.model + " " + car1.color + " " + car1.mileage);
        System.out.println(car2.model + " " + car2.color + " " + car2.mileage);
    }
}
