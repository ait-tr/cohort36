package classwork.example01;

public class Employee {
    private String name;
    private String job;
    private int experience;
    private double salary;

    private Employee(String name, String job, int experience, double salary) {
        this.name = name;
        this.job = job;
        this.experience = experience;
        this.salary = salary;
    }

    public static Employee ofDefaultJob(String name, Jobs job) {
        Employee employee = null;
        switch (job) {
            case DEV:
                employee = new Employee(name, "Junior developer", 0, 1000);
                break;
            case QA:
                employee = new Employee(name, "Junior QA Automation engineer", 0, 900);
                break;
            case PM:
                employee = new Employee(name, "Project manager", 0, 3000);
                break;
            case HR:
                employee = new Employee(name, "Human resources", 0, 1500);
                break;
            case SEO:
                employee = new Employee(name, "SEO", 0, 1200);
                break;
        }
        return employee;
    }

    public static Employee getDefault() {
        return new Employee("Unknown", "Unknown", 0, 0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", experience=" + experience +
                ", salary=" + salary +
                '}';
    }
}
