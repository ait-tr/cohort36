package classwork;

import java.util.Random;

public class Human {
    private String name;
    private boolean sex;

    public Human(String name, boolean sex) {
        this.name = name;
        this.sex = sex;
    }

    public Human giveBirth(String babyName) {
        if (sex) {
            return null;
        } else {
            return new Human(babyName, new Random().nextBoolean());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }


}
