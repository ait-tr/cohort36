package classwork.example01.work;

public class Employee {
    // зарплата
    private int salary;
    // должность
    private String position;
    // имя
    private String name;

    public Employee(String name, String position, int salary) {
        // задаем значение
        this.name = name;
        this.position = position;
        this.salary = salary;
    }
    // геттер для зарплаты
    public int getSalary() {
        return salary;
    }
    // геттер для должности
    public String getPosition() {
        return position;
    }
    // геттер для имени
    public String getName() {
        return name;
    }
    // сеттер для зарплаты
    public void setSalary(int salary) {
        // минимальная зп в месяц при раб дне 8 часов, 21 день и 12.8 евро в час, будет 2150
        // если кто-то пытается поставить зп меньше, выставляем автоматически минималку
        if (salary < 2150) {
            this.salary = 2150;
        } else {
            this.salary = salary;
        }
    }
    // сеттер для должности
    public void setPosition(String position) {
        this.position = position;
    }
    // сеттер для имени
    public void setName(String name) {
        if (name.isEmpty()) {
            return;
        }
        this.name = name;
    }

}
