package classwork.example01;

public class Minute {
    private int value;

    public Minute(int value) {
        if (value < 0 || value > 59) {
            this.value = 0;
        } else {
            this.value = value;
        }
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if (value < 0 || value > 59) {
            return;
        }
        this.value = value;
    }
}
