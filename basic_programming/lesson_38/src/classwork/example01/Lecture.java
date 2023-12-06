package classwork.example01;

public class Lecture {
    private String topic; // тема
    private double duration; // длительность

    private Student[] students;
    private int studentAmount;

    public Lecture(String topic, double duration, int capacity) {
        this.topic = topic;
        this.duration = duration;
        students = new Student[capacity];
        studentAmount = 0;
    }

    public void addStudent(Student student) {
        if (studentAmount == students.length) {
            System.out.println("Нет свободных мест!");
            return;
        }
        students[studentAmount] = student;
        studentAmount++;
    }
    // просто линейный поиск с модификациями:
    public void removeStudent(Student student) {
        // переменная в которую запишем, нашли ли значение
        boolean found = false;
        for (int i = 0; i < studentAmount; i++) {
            // если еще не нашли значение
            if (!found) {
                // и если текущий элемент равен искомому
                if (students[i] == student) {
                    // обозначаем, что нашли объект
                    found = true;
                }
            }
            // если уже нашли объект, перемещаем элементы чтобы удалить их
            if (found) {
                students[i] = students[i + 1];
            }
        }
        // если нашли элемент
        if (found) {
            // уменьшаем на количество, ведь если нашли, значит и удалили
            studentAmount--;
        }
    }

    public void beginLecture() {
        System.out.println("Начинаем лекцию на тему " + topic);
        System.out.println("Студентов на лекции: " + studentAmount);
        System.out.println("Присутствующие студенты: ");
        for (int i = 0; i < studentAmount; i++) {
            System.out.print(students[i].getName() + ", ");
            students[i].setHoursStudied(students[i].getHoursStudied() + duration);
        }
        System.out.println("(лекция происходит)");
        System.out.println("Лекция окончена! Время лекции: " + duration + "ч");
    }

    public int getStudentAmount() {
        return studentAmount;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }
}
