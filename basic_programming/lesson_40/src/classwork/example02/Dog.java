package classwork.example02;

import java.util.Objects;

public class Dog extends Pet {
    private String breed;

    public Dog(String name, int sex, double age, String furColor, String breed) {
        super(name, sex, age, furColor);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + ": gav gav gav");
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
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        Dog dog;
        if (obj instanceof Dog) {
            dog = (Dog) obj;
        } else {
            return false;
        }

        return this.getName().equals(dog.getName())
                && this.getSex() == dog.getSex()
                && this.getAge() == dog.getAge()
                && this.breed.equals(dog.breed)
                && this.getFurColor().equals(dog.getFurColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), breed);
    }

}
