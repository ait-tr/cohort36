package classwork.example02;

public class Employee {
    // поле, куда запишем должность "объекта"
    String jobTitle;
    // поле, куда записываем имя
    String name;
    // поле, куда записываем зарплату
    double salary;
    // метод, который позволит представиться нашему "объекту"
    public void introduce() {
        System.out.println("Hello, my name is " + name + ", im " + jobTitle);
    }
}
