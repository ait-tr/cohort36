package classwork.example02;

import java.util.Objects;

public class Pet {
    protected String name;
    protected int sex;
    protected double age;
    protected String furColor;

    public Pet(String name, int sex, double age, String furColor) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.furColor = furColor;
    }

    public void makeSound() {
        System.out.println(name + " makes some sounds!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    @Override
    public String toString() {
        return "name: " + this.name + ", "
                + "sex: " + this.sex + ", "
                + "age: " + this.age + ", "
                + "fur color: " + this.furColor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sex, age, furColor);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        Pet pet;
        if (obj instanceof Pet) {
            pet = (Pet) obj;
        } else {
            return false;
        }

        return this.name.equals(pet.name)
                && this.sex == pet.sex
                && this.age == pet.age
                && this.furColor.equals(pet.furColor);
    }
}
