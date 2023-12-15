package classwork.example02;

public class Main {
    public static void main(String[] args) {
        Pet animal1 = new Dog("Bobik", 4);
        Pet animal2 = new Cat("Murzik", 3);

        animal1.voice();
        animal2.voice();
    }
}
