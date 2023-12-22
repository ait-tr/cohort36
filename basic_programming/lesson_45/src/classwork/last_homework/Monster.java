package classwork.last_homework;

//Добавить классы Монстр и Игрок, которые будут наследовать класс Существо.
public class Monster extends Entity implements Attackable {
    public Monster(String name, int health, int damage) {
        super(name, health, damage);
    }

    //Монстр - атакует и получает урон как есть.
    @Override
    public void attack(Attackable target) {
        System.out.println("Monster " + name + " attacking with " + damage + " damage!");
        target.takeDamage(this, damage);
    }
    //Монстр - атакует и получает урон как есть.
    @Override
    public void takeDamage(Attackable source, int damage) {
        System.out.println("Monster " + name + " takes " + damage + " damage!");
        health -= damage;
        if (isAlive()) {
            System.out.println("Monster " + name + " now has " + health + " health!");
        } else {
            System.out.println("Monster " + name + " died!");
        }
    }

    @Override
    public String toString() {
        return "Monster" + super.toString();
    }
}
