package classwork.example01;

public class Cat extends Pet {

    private String breed;

    public Cat(String name, int sex, double age, String furColor, String breed) {
        super(name, sex, age, furColor);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + ": mew mew mew");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return super.toString() + ", "
                + "breed: " + this.breed;
    }
}
