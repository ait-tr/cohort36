package classwork.example01;

public enum Direction {
    // всего 4 направления
    DOWN("down"),
    UP("up"),
    LEFT("left"),
    RIGHT("right");

    // название направления
    private String name;

    // конструктор. Приватный чтобы не позволять создание объектов вне класса
    private Direction(String name) {
        this.name = name;
    }

    // геттер
    public String getName() {
        return name;
    }
}
