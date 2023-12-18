package classwork.example01;

public class Main {
    /*
    Разработать программу, в которой можно создавать геометрические формы, считать их периметр и площадь
    Сделать так, чтобы формы можно было транслировать
     */
    public static void main(String[] args) {
        Triangle triangle = new Triangle(
                new Point(0, 0),
                new Point(0, 3),
                new Point(4, 0)
        );
        System.out.println(triangle);
        triangle.translate(5, 6);
        System.out.println(triangle);
    }
}
