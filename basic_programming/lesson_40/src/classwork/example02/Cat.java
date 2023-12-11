package classwork.example02;

import java.util.Objects;

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

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getFurColor(), getSex(), this.breed);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        Cat cat;
        if (obj instanceof Cat) {
            cat = (Cat) obj;
        } else {
            return false;
        }

        return this.getName().equals(cat.getName())
                && this.getSex() == cat.getSex()
                && this.getAge() == cat.getAge()
                && this.breed.equals(cat.breed)
                && this.getFurColor().equals(cat.getFurColor());
    }
}
