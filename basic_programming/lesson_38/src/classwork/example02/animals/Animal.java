package classwork.example02.animals;

public class Animal {
    protected String species; // вид
    protected String habitationArea; // зона проживания
    protected double averageLifespan; // средняя продолжительность жизни

    public Animal(String species, String habitationArea, double averageLifespan) {
        this.species = species;
        this.habitationArea = habitationArea;
        this.averageLifespan = averageLifespan;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getHabitationArea() {
        return habitationArea;
    }

    public void setHabitationArea(String habitationArea) {
        this.habitationArea = habitationArea;
    }

    public double getAverageLifespan() {
        return averageLifespan;
    }

    public void setAverageLifespan(double averageLifespan) {
        this.averageLifespan = averageLifespan;
    }
}
