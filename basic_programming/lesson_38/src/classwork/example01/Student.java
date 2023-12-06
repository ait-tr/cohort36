package classwork.example01;

public class Student {
    private String name;
    private double hoursStudied;

    public Student(String name, double hoursStudied) {
        this.name = name;
        this.hoursStudied = hoursStudied;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHoursStudied() {
        return hoursStudied;
    }

    public void setHoursStudied(double hoursStudied) {
        this.hoursStudied = hoursStudied;
    }
}
