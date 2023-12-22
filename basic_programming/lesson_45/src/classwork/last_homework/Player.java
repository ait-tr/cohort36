package classwork.last_homework;

// Добавить классы Монстр и Игрок, которые будут наследовать класс Существо.
// Класс Игрок должен быть абстрактным.
public abstract class Player extends Entity implements Attackable {
    protected Player(String name, int health, int damage) {
        super(name, health, damage);
    }
}
