package classwork.example02;

public abstract class Pet {
    protected String name;

    protected Pet(String name) {
        this.name = name;
    }

    public abstract void talk();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
