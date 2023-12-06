package classwork.example02.animals;

public class Wolf extends Canine {

    public Wolf(String species, String habitationArea, double averageLifespan,
                String furColor, String furType, double length, double height) {
        super(species, habitationArea, averageLifespan,
                furColor, furType, length, height);
    }

    public void howl() {
        System.out.println("ауууууууууууууууууууууу");
    }
}
