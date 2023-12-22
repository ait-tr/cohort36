package classwork.last_homework;

import java.util.Objects;

//Наследовать от класса Игрок три класса - Маг, Воин и Лучник.
public class Warrior extends Player {
    //Для воина определить поле количество брони (int).
    private int armor;

    public Warrior(String name, int health, int damage, int armor) {
        super(name, health, damage);
        this.armor = armor;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", damage=" + damage +
                ", armor=" + armor +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), armor);
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) {
            return false;
        }
        if (o instanceof Warrior) {
            return ((Warrior) o).armor == this.armor;
        }
        return false;
    }

    @Override
    public void attack(Attackable target) {
        //Воин - атакует ровно с такой же силой, как и значение его силы атаки.
        System.out.println("Warrior " + name + " attacks with damage " + damage);
        target.takeDamage(this, damage);
    }

    @Override
    public void takeDamage(Attackable source, int damage) {
        //Получаемый урон уменьшается на половину значения брони.
        damage -= armor / 2;
        if (damage >= 0) {
            health -= damage;
            System.out.println("Warrior " + name + " takes " + damage + " damage, now his health is " + health);
        } else {
            System.out.println("Warrior " + name + " blocked the attack");
        }
    }
}
