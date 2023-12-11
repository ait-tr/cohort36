package classwork.example02;

import java.util.Scanner;

public class  Main01 {
    /*
     Разработать метод для сравнения объектов типа Pet, Dog и Cat
     (переопределить equals)
     */

    public static void main(String[] args) {
        Dog dog1 = new Dog("Dimon", 1, 4, "Pale", "Pug");
        Dog dog2 = new Dog("Dimon", 1, 4, "Pale", "Pug");
        System.out.println(dog1.equals(dog2));
        dog1.setName("Bobik");
        System.out.println(dog1.equals(dog2));
    }
}
