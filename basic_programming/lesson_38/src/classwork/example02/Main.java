package classwork.example02;

import classwork.example02.animals.Dog;

public class Main {
    /*
    описать классы животное, животное семьи собачих, волк и собака
     */

    public static void main(String[] args) {
        Dog dog = new Dog("Domestic dog", "anywhere", 15, "Cream", "Mid length",
                1.2, 0.7, "Bobik", "Golden retriever");
        dog.bark();
    }
}
