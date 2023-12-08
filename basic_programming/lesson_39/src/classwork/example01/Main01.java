package classwork.example01;

public class Main01 {
    /*
    Описать массив из 8 мопсов и 2 котов
    проверить, как там каждый питомец
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

    public static void main(String[] args) {
        // 8 мопсов + 2 кота = 10 питомцев
        Pet[] pets = new Pet[10];
        // имена всех питомцев
        String[] names = {"Dimon", "Katie", "Alice", "Lena", "Nastya", "Olya", "Jane", "Inga", "Murzik", "Barsik"};
        for (int i = 0; i < pets.length; i++) {
            // в элементы меньше 8 записываем собак, в остальные котов
            if (i < 8) {
                pets[i] = new Dog(names[i], 0, 4, "Pale", "Pug");
            } else {
                pets[i] = new Cat(names[i], 1, 7, "Multicolor", "No breed");
            }
        }
        // димон - мальчик. Меняем ему пол на мужской
        pets[0].setSex(1);

        for (int i = 0; i < pets.length; i++) {
            // проверяем каждого питомца в массиве
            checkOnPet(pets[i]);
        }
    }
}
