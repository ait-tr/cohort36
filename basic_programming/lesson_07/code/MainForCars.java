import java.util.Scanner;

/**
 * 9/22/2023
 * lesson_06
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class MainForCars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // объявили сканнер для чтения
        // сделали три переменные, в которые мы будем сохранять данные из консоли
        String carModel;
        String carColor;
        int carMileage;

        // ЭТАП 1

        // с консоли считали данные
        carModel = scanner.nextLine();
        carColor = scanner.nextLine();
        carMileage = scanner.nextInt();

        scanner.nextLine(); // читаем до конца

        // создали первый объект автомобиля

        // ЭТАП 2
        Car car1 = new Car();
        // положили значения переменных в поля этого автомобиля
        car1.model = carModel;
        car1.color = carColor;
        car1.mileage = carMileage;

        // ЭТАП 3

        // с консоли считали данные
        carModel = scanner.nextLine();
        carColor = scanner.nextLine();
        carMileage = scanner.nextInt();

        // ЭТАП 4
        Car car2 = new Car();
        // положили значения переменных в поля нового автомобиля
        car2.model = carModel;
        car2.color = carColor;
        car2.mileage = carMileage;

        // ЭТАП 5
        car1.go();
        car2.go();

        System.out.println(car1.model + " " + car1.color + " " + car1.mileage);
        System.out.println(car2.model + " " + car2.color + " " + car2.mileage);
    }
}
