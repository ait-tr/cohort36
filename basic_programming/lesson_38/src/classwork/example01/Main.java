package classwork.example01;

public class Main {
    /*
    Создать систему для отслеживания посещаемости студентов
     */

    public static void printStudent(Student student) {
        System.out.println("Студент:" + student.getName()
                + ", часов учился: " + student.getHoursStudied() + "ч");
    }

    public static void main(String[] args) {
        Student student1 = new Student("Василий Карпенко", 5);
        Student student2 = new Student("Марина Остапчук", 4);
        Student student3 = new Student("Геннадий Власов", 6);
        Lecture lecture1 = new Lecture("Условные операторы", 1.5, 20);

        printStudent(student1);
        printStudent(student2);
        printStudent(student3);

        lecture1.addStudent(student1);
        lecture1.addStudent(student2);
        lecture1.addStudent(student3);

        lecture1.beginLecture();
        System.out.println();

        printStudent(student1);
        printStudent(student2);
        printStudent(student3);
        lecture1.removeStudent(student3);
        lecture1.setTopic("Циклы");
        lecture1.beginLecture();
        printStudent(student1);
        printStudent(student2);
        printStudent(student3);
    }
}
