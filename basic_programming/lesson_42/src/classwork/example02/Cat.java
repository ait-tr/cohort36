package classwork.example02;

public class Cat extends Pet {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void voice() {
        System.out.println("Cat ignores you and leaves");
    }
}
