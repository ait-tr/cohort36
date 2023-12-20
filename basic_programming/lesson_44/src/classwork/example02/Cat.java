package classwork.example02;

public class Cat extends Pet implements Petable, Feedable, Washable {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void feed() {
        System.out.println("You give your cat some food");
    }

    @Override
    public void cleanUp() {
        System.out.println("You cleaned up cat litter box");
    }

    @Override
    public void talk() {
        System.out.println("Cat: meow meow");
    }

    @Override
    public void pet() {
        System.out.println("You pet your cat, it purrs");
    }

    @Override
    public void wash() {
        System.out.println("You try to wash the cat, it scratches you and runs away");
    }
}
