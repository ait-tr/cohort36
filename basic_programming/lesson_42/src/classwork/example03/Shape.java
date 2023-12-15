package classwork.example03;

public abstract class Shape {
    protected String name;

    protected Shape(String name) {
        this.name = name;
    }

    public abstract double getPerimeter();
    public abstract double getSquare();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
