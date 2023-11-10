package classwork.example01;

import classwork.example01.work.Employee;

public class Main {

    public static void main(String[] args) {
        // создаем объект
        Employee employee = new Employee("Janet", "Manager", 4000);
        // получаем данные из объекта с помощью геттеров и выводим в консоль
        System.out.println(employee.getName() + ", works as " + employee.getPosition() + ", gets "
                + employee.getSalary() + " per month");
        // время повышения!
        System.out.println("Time for raise!");
        // меняем ЗП на 5500 с помощью сеттера
        employee.setSalary(5500);
        // меняем позицию на главного менеджера с помощью сеттера
        employee.setPosition("Lead Manager");
        // снова печатаем всю информацию
        System.out.println(employee.getName() + ", works as " + employee.getPosition() + ", gets "
                + employee.getSalary() + " per month");
    }
}
