package classwork.example03;

public class Main {
    /*
    Разработать программу, в которой можно создавать геометрические формы, считать их периметр и площадь
     */
    public static void main(String[] args) {
        Shape shape1 = new Rectangle(4, 6);
        System.out.println(shape1);
        System.out.println(shape1.getPerimeter());
        System.out.println(shape1.getSquare());

        Shape shape2 = new Triangle(3, 4, 5);
        System.out.println(shape2);
        System.out.println(shape2.getPerimeter());
        System.out.println(shape2.getSquare());
    }
}
