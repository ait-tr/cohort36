package classwork.example01;

import java.util.Scanner;

public class Main {

    /*
    разработать классы питомец, кот и собака
    Сделать метод "издать звук"
     */

    public static void checkOnPet(Pet pet) {
        // pet is instance of dog - питомец является экземпляром собаки
        if (pet instanceof Dog) {
            // если собака, пишем что собака в порядке
            System.out.println("Your dog is fine!");
        }
        // pet is instance of cat - питомец является экземпляром кота
        if (pet instanceof Cat) {
            // если кот, пишем что кот в порядке
            System.out.println("Your cat is fine!");
        }
        // для любого питомца, пишем
        pet.makeSound();
    }

    public static void main(String[] args) {
        /*
        // так тоже можно!
        Object dog = new Dog("Bobik", 1, 5, "Cream", "Golden retriever");
        dog = new Scanner(System.in);
        dog = "Hello";
        dog = 32;
        */
        // создаем питомца собаку
        Pet pet1 = new Dog("Bobik", 1, 5, "Cream", "Golden retriever");
        // создаем питомца кота
        Pet pet2 = new Cat("Barsik", 1, 3, "Black", "Bombay");
        // проверяем первого питомца
        checkOnPet(pet1);
        // проверяем второго питомца
        checkOnPet(pet2);

        // Теперь создаем просто питомца
        Pet pet = new Pet("Barsik", 1, 3, "Black");
        // проверяем просто питомца
        checkOnPet(pet);
        //pet.getClass() == Dog.class
        if (pet instanceof Dog) {
            // этот код выполняться не будет, потому что pet не ссылается на объект класса Dog
            Dog dog = (Dog) pet;
            dog.makeSound();
        }
    }
}
