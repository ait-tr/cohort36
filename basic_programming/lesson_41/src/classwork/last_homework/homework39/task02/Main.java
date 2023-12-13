package classwork.last_homework.homework39.task02;

import java.util.Random;

public class Main {

    public static void beginWorking(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] instanceof Manager) {
                Manager manager = (Manager) employees[i];
                manager.makeOthersWork();
            }
            if (employees[i] instanceof Developer) {
                Developer developer = (Developer) employees[i];
                developer.work();
            }
        }
    }

    public static Employee raise(Employee employee) {
        if (employee instanceof Manager) {
            employee.setSalary( employee.getSalary() + 1000);
            return employee;
        }
        if (employee instanceof Developer) {
            return new Manager(employee.getName(), 5000);
        }
        return null;
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Manager("Juliet", 5000);
        String[] names = {"Jack", "John", "Juliet", "Julius", "Janette", "Johan"};
        Random random = new Random();
        for (int i = 1; i < employees.length; i++) {
            employees[i] = new Developer(names[random.nextInt(names.length)], (2000 + random.nextInt(100)) * 10);
        }
        int randomDev = random.nextInt(1, employees.length);
        employees[randomDev] = raise(employees[randomDev]);
        employees[0] = raise(employees[0]);
        beginWorking(employees);
    }
}
