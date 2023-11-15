package classwork.example01;

public class Position {
    // координаты
    private double x;
    private double y;

    public Position() {
        x = 0;
        y = 0;
    }

    // конструкторы
    public Position(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    // аксесоры
    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    // метод предназначен для того, чтобы двигать точку в определенном направлении
    public void move(double distance, Direction direction) {
        switch (direction) {
            // вверх - в + по у
            case UP:
                y += distance;
                break;
            // вниз - в - по у
            case DOWN:
                y -= distance;
                break;
            // влево - в - по х
            case LEFT:
                x -= distance;
                break;
            // вправо - в + по х
            case RIGHT:
                x += distance;
                break;
        }
    }
}
