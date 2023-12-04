package classwork.example01;

public class Main {

    /*
    Разработать класс машина и двигатель
    Машина должна уметь ездить по вызову метода на какое-то расстояние
    Добавить надобность заправляться
     */
    public static void main(String[] args) {
        Car car = new Car("Тойота", 65, 8.5, "бензин");
        car.drive(1000);
        car.drive(100);
        System.out.println("Топлива осталось: " + car.getFuelAmount());
        car.refill();
        System.out.println("Топливо восполнено! Уровень: " + car.getFuelAmount());
        car.drive(50);
        System.out.println("Топлива осталось: " + car.getFuelAmount());
    }
}
