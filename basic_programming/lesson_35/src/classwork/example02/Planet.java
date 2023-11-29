package classwork.example02;

public class Planet {
    private String name;
    private long mass; // in MT
    private String type;
    private long population;
    private int radius; // in km
    private String biome;

    public Planet(String name, String type, String biome, long population, int radius, long mass) {
        this.name = name;
        this.type = type;
        this.biome = biome;
        this.population = population;
        this.radius = radius;
        this.mass = mass;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setMass(long mass) {
        this.mass = mass;
    }

    public long getMass() {
        return this.mass;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public long getPopulation() {
        return this.population;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return this.radius;
    }

    public void setBiome(String biome) {
        this.biome = biome;
    }

    public String getBiome() {
        return this.biome;
    }
}
