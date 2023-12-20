package classwork.example02;

public class Fish extends Pet implements Feedable {

    public Fish(String name) {
        super(name);
    }

    @Override
    public void feed() {
        System.out.println("You throw some fish food into aquarium");
    }

    @Override
    public void cleanUp() {
        System.out.println("You changed dirty water in aquarium");
    }

    @Override
    public void talk() {
        System.out.println("Fish is silent.");
    }
}
