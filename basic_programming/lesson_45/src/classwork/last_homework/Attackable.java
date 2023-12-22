package classwork.last_homework;

//Создать интерфейс Attackable. В нем определить методы:
public interface Attackable {
    //1. void attack(Attackable target) - позволяет атаковать кого-то, кого можно атаковать
    void attack(Attackable target);
    //2. void takeDamage(Attackable source) - позволяет получить урон от кого-то
    void takeDamage(Attackable source, int damage);
}
