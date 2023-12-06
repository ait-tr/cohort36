package classwork.example02.animals;

public class Dog extends Canine {
    protected String name;
    protected String breed;

    public Dog(String species, String habitationArea, double averageLifespan, String furColor,
               String furType, double length, double height, String name, String breed) {
        super(species, habitationArea, averageLifespan, furColor, furType, length, height);
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
