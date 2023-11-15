package classwork.example01;

public class Main {

    public static void printPosition(Position position) {
        System.out.println(position.getX() + "; " + position.getY());
    }

    public static void main(String[] args) {
        // задаем точку
        Position pos = new Position(3, 5);
        printPosition(pos);
        // смещаем точку на 10 вправо
        pos.move(10, Direction.RIGHT);
        printPosition(pos);
        // сохраняем ссылку на направление
        Direction direction = Direction.DOWN;
        // двигаем на 4 в том направлении, которое сохранили
        pos.move(4, direction);
        printPosition(pos);
    }
}
