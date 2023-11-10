package classwork.last_homework.task01_25;

public class Human {
    // имя человека
    public String name;
    // возраст человека
    public int age;

    // метод который позволяет человеку представиться
    public void introduce() {
        System.out.println("Hello my name is " + name + ", im "
                + age + " years old");
    }
}
