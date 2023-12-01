package classwork.example02;

public class Ruler {
    private double length; // actual length

    private double width;

    private double thickness;

    private String material;

    private int centimeters; // сколько отмечено см

    /*
    Описать конструкторы:
    по умолчанию
    со всеми параметрами
    с только самыми важными параметрами
     */

    public Ruler() {
        // вызываем другой конструктор этого класса
        this(17, 2, 0.1, "Steel", 15);
    }

    public Ruler(double length, double width, double thickness, String material, int centimeters) {
        this.length = length;
        this.width = width;
        this.thickness = thickness;
        this.material = material;
        this.centimeters = centimeters;
    }

    public Ruler(int centimeters) {
        this(17, 2, 0.2, "Steel", centimeters);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getThickness() {
        return thickness;
    }

    public void setThickness(double thickness) {
        this.thickness = thickness;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getCentimeters() {
        return centimeters;
    }

    public void setCentimeters(int centimeters) {
        this.centimeters = centimeters;
    }
}
