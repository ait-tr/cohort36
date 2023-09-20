/**
 * 9/20/2023
 * lesson_06
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main03 {
    public static void main(String[] args) {
        Human h1 = new Human();
        // h1 - объектная переменная,
        // new - оператор создания объекта
        // (выделения памяти)
        h1.name = "Marsel";
        h1.age = 29;

        Human h2 = new Human();
        h2.name = "Liliana";
        h2.age = 18;

        h1.sayHello();
        h2.sayHello();

        System.out.println("Age of " + h1.name + " is " + h1.age); // Ctrl + D
        System.out.println("Age of " + h2.name + " is " + h2.age);
    }
}
