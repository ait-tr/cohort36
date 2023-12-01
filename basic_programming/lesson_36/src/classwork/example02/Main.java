package classwork.example02;

public class Main {

    /*
    описать класс Линейка, привести пример использования конструктора
     */

    public static void main(String[] args) {
        Ruler ruler = new Ruler(30);

        System.out.println("Dimensions: " + ruler.getLength() + "x"
                + ruler.getWidth() + "x" + ruler.getThickness());
        System.out.println("Material: " + ruler.getMaterial());
        System.out.println("Centimeters: " + ruler.getCentimeters());
    }
}
