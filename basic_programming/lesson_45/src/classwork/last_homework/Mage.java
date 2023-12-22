package classwork.last_homework;

//Наследовать от класса Игрок три класса - Маг, Воин и Лучник.
public class Mage extends Player {
    //Для мага определить поле количество маны (double).
    private double mana;

    public Mage(String name, int health, int damage, double mana) {
        super(name, health, damage);
        this.mana = mana;
    }

    public double getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    @Override
    public String toString() {
        return "Mage{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", damage=" + damage +
                ", mana=" + mana +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) {
            return false;
        }
        if (o instanceof Mage) {
            return ((Mage) o).mana == this.mana;
        }
        return false;
    }

    @Override
    public void attack(Attackable target) {
        int finalDamage;
        if (mana >= 1) {
            //Маг - атакует в два раза больше силы атаки если у него достаточно маны.
            finalDamage = 2 * damage;
            //Каждую атаку тратится 1 маны.
            mana--;
            System.out.println("Mage " + name + " attacks with " + finalDamage + " damage, his mana is now " + mana);
        } else {
            //Если у мага меньше 1 маны, не наносит урон вообще.
            finalDamage = 0;
            System.out.println("Mage " + name + " doesnt have enough mana to attack!");
        }
        target.takeDamage(this, finalDamage);
    }

    @Override
    public void takeDamage(Attackable source, int damage) {
        health -= damage;
        //Когда маг получает урон, он восстанавливает 0.2 маны.
        mana += 0.2;
        System.out.println("Mage " + name + " took " + damage + " damage, his health is now " + health + " and mana is " + mana);
    }
}
