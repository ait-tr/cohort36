package classwork.example01;

import java.util.Scanner;

public class  Main01 {
    /*
     Разработать метод, который вернет первого питомца из массива с именем начинающимся на переданную букву
     */

    public static void checkOnPet(Pet pet) {
        if (pet instanceof Dog) {
            System.out.println("Your dog is fine!");
        }
        if (pet instanceof Cat) {
            System.out.println("Your cat is fine!");
        }
        pet.makeSound();
    }

    public static Pet getPet(Pet[] pets, char firstLetter) {
        for (int i = 0; i < pets.length; i++) {
            if (firstLetter == pets[i].getName().charAt(0)) {
                return pets[i];
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Pet[] pets = new Pet[10];
        String[] names = {"Dimon", "Katie", "Alice", "Lena", "Nastya", "Olya", "Jane", "Inga", "Murzik", "Barsik"};
        for (int i = 0; i < pets.length; i++) {
            if (i < 8) {
                pets[i] = new Dog(names[i], 0, 4, "Pale", "Pug");
            } else {
                pets[i] = new Cat(names[i], 1, 7, "Multicolor", "No breed");
            }
        }
        pets[0].setSex(1);
        for (int i = 0; i < pets.length; i++) {
            checkOnPet(pets[i]);
        }

        Scanner scanner = new Scanner(System.in);
        char firstLetter = scanner.next().charAt(0);
        Pet pet = getPet(pets, firstLetter);
        if (pet == null) {
            System.out.println("Pet not found!");
        } else {
            System.out.println("Pet found: " + pet);
        }
    }
}
