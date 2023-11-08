package classwork.example01;

/*
Описать класс "самолет"
 */

public class Main {

    public static void printPlaneInfo(Plane plane) {
        // просто по очереди выводим все поля
        System.out.println("Model: " + plane.model);
        System.out.println("Is passenger plane: " + plane.isPassenger);
        System.out.println("Passenger seats: " + plane.seats);
        System.out.println("Distance (km): " + plane.distance);
        System.out.println("Speed (km/h): " + plane.speed);
        System.out.println("Wingspan (m): " + plane.wingspan);
        System.out.println("Max payload (tonn): " + plane.payload);
        System.out.println("Operation flight height: " + plane.flightHeight);
    }

    public static void main(String[] args) {
        // создаем объект самолета через конструктор с параметрами
        Plane plane = new Plane("AN-223 Mriya", false, 6, 5000, 1000, 40, 250, 12000);
        // вызываем метод, который напечатает информацию о самолете в консоль
        printPlaneInfo(plane);
        // создаем объект самолета через конструктор по умолчанию
        Plane plane1 = new Plane();
        // снова печатаем, но другой самолет
        printPlaneInfo(plane1);
    }
}
