package classwork.example01;

public class Metal {
    private String name;
    private int meltingTemperature;
    private String color;
    private double density;
    private boolean isValuable;

    public Metal() {}

    public Metal(String name, int meltingTemperature, String color, double density, boolean isValuable) {
        this.name = name;
        this.meltingTemperature = meltingTemperature;
        this.color = color;
        this.density = density;
        this.isValuable = isValuable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMeltingTemperature() {
        return meltingTemperature;
    }

    public void setMeltingTemperature(int meltingTemperature) {
        this.meltingTemperature = meltingTemperature;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    public boolean isValuable() {
        return isValuable;
    }

    public void setValuable(boolean valuable) {
        isValuable = valuable;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n"
                + "Color: " + color + "\n"
                + "Melting temperature: " + meltingTemperature + "\n"
                + "Density: " + density + "\n"
                + "Is valuable: " + isValuable;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Metal) {
            Metal metal = (Metal) obj;
            return metal.name.equals(this.name)
                    && metal.meltingTemperature == this.meltingTemperature
                    && metal.color.equals(this.color)
                    && metal.density == this.density
                    && metal.isValuable == this.isValuable;
        }
        return false;
    }
}
