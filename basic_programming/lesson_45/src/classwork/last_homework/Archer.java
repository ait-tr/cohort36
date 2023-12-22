package classwork.last_homework;

import java.util.Random;

//Наследовать от класса Игрок три класса - Маг, Воин и Лучник.
public class Archer extends Player {
    protected Archer(String name, int health, int damage) {
        super(name, health, damage);
    }

    @Override
    public String toString() {
        return "Archer" + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) {
            return false;
        }
        return o instanceof Archer;
    }
    private boolean eventShouldOccur(double chance) {
        return new Random().nextInt(100) < chance;
    }
    @Override
    public void attack(Attackable target) {
        int finalDamage = damage;
        System.out.println("Archer " + name + " shots an arrow with damage " + finalDamage);
        if (eventShouldOccur(20)) {
            System.out.println("Archer " + name + " deals double the damage!");
            //При атаке имеет шанс 20% нанести двойной урон.
            finalDamage *= 2;
        }
        target.takeDamage(this, finalDamage);
    }

    @Override
    public void takeDamage(Attackable source, int damage) {
        //При получении урона Лучник имеет шанс 25% уклониться от атаки и получить 0 единиц урона.
       if (eventShouldOccur(25)) {
            System.out.println("Archer " + name + " avoided attack!");
        } else {
            health -= damage;
            System.out.println("Archer took " + damage + " damage. Now his health is " + health);
        }
    }
}
