package classwork.example02;

public class Main {
    public static void main(String[] args) {
        // Создаем объект Джек
        Employee jack = new Employee();
        // Задаем значения для полей этого объекта
        jack.name = "Jack";
        jack.salary = 5000;
        jack.jobTitle = "Senior Java Developer";

        // Создаем объект Мари
        Employee marie = new Employee();
        // Задаем значения для полей этого объекта
        marie.name = "Marie";
        marie.salary = 6500;
        marie.jobTitle = "Team Lead";

        // По очереди просим объекты представиться
        jack.introduce();
        marie.introduce();
    }
}
