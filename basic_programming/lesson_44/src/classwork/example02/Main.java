package classwork.example02;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat("Barsik");
        Fish fish = new Fish("Napoleon");

        cat.feed();
        cat.pet();
        cat.talk();
        cat.cleanUp();
        cat.wash();

        fish.cleanUp();
        fish.feed();
        fish.talk();


    }
}
