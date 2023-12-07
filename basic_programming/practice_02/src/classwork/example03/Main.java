package classwork.example03;

public class Main {
    /*
     создать систему для подсчета цены блюда по ценам ингридиентов
     */

    public static void main(String[] args) {
        Meal pizza = new Meal("Pepperoni", 5);
        Ingredient dough = new Ingredient("Dough", 120, 4);
        Ingredient sauce = new Ingredient("Pizza sauce", 20 , 1);
        Ingredient sausage = new Ingredient("Smoked pepperoni sausage", 50, 5);
        Ingredient cheese = new Ingredient("Mozarella", 30, 12);
        Ingredient greens = new Ingredient("Greens", 10, 3);

        pizza.addIngredient(dough);
        pizza.addIngredient(sauce);
        pizza.addIngredient(sausage);
        pizza.addIngredient(cheese);
        pizza.addIngredient(greens);
        System.out.println(pizza.getPrice());
        System.out.println(pizza.getPrice(4));
    }
}
