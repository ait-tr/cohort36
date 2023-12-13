package classwork.last_homework.homework39.task02;

public class Developer extends Employee {

    public Developer(String name, double salary) {
        super(name, "Developer", salary);
    }

    public void work() {
        System.out.println("Developer " + name
                + " is working on some feature...");
    }


}
