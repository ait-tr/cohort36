package classwork.example02;

public abstract class Pet {
    protected String name;
    protected int age;

    protected Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void voice();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
