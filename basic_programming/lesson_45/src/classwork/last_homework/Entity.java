package classwork.last_homework;

import java.util.Objects;
//Разработать абстрактный класс Существо (Entity),
public abstract class Entity {
    // для него определить поля имя (String),
    //количество здоровья (int) и сила атаки (int).
    protected String name;
    protected int health;
    protected int damage;

    protected Entity(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    //Добавить метод isAlive() возвращающий true если здоровье существа выше 0 и false если равно или ниже 0.
    public boolean isAlive() {
        return health > 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    //Применить инкапсуляцию, переопределить методы equals, hashCode и toString.
    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", damage=" + damage +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, damage);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o instanceof Entity) {
            Entity entity = (Entity) o;
            return entity.damage == this.damage
                    && entity.health == this.health
                    && entity.name.equals(this.name);
        }
        return false;
    }
}
