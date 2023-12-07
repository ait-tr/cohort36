package classwork.example02;

public class Main {
    /*
    Разработать классы домашнее задание и студент
     */

    public static void main(String[] args) {
        Student student = new Student("Валерий");
        Homework homework = new Homework("(выполненное домашнее задание)", student);

        System.out.println("Домашнее задание выполнил: "
                + homework.getAuthor().getName());
        System.out.println("Текст домашнего задания: "
                + homework.getText());
    }
}
