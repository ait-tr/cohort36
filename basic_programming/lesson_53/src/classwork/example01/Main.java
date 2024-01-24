package classwork.example01;

public class Main {

    // Factory method - метод-фабрика, который создает объект
    // Factory method pattern - шаблон проектирования, который описывает, как должен быть устроен Factory method

    public static void main(String[] args) {
        Employee employee = Employee.getDefault();
        System.out.println(employee);
        employee = Employee.ofDefaultJob("Marie", Jobs.HR);
        System.out.println(employee);

        //String.valueOf()
        //Integer.parseInt()
        //Integer.valueOf()
        //LocalDateTime.now()

    }
}
