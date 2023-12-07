package classwork.example03;

public class Meal {
    private String name;
    private Ingredient[] ingredients;
    private int addedIngredients;

    public Meal(String name, int ingredientAmount) {
        this.name = name;
        ingredients = new Ingredient[ingredientAmount];
        addedIngredients = 0;
    }

    public boolean addIngredient(Ingredient ingredient) {
        if (addedIngredients == ingredients.length) {
            return false;
        }
        ingredients[addedIngredients] = ingredient;
        addedIngredients++;
        return true;
    }

    public double getPrice() {
        double sum = 0;
        for (int i = 0; i < addedIngredients; i++) {
            sum += ingredients[i].getPrice() * (ingredients[i].getAmount() / 1000.0);
        }
        return sum;
    }

    public double getPrice(int addedPrice) {
        return getPrice() + addedPrice;
    }

    public double getPrice(double coefficient) {
        return getPrice() * coefficient;
    }

    public double getPrice(int addedPrice, double coefficient) {
        return (getPrice() + addedPrice) * coefficient;
    }

    public double getPrice(double coefficient, int addedPrice) {
        return getPrice() * coefficient + addedPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
