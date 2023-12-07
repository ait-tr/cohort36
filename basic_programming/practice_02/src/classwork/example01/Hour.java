package classwork.example01;

public class Hour {
    private int value;

    public Hour(int value) {
        if (value < 0 || value > 23) {
            this.value = 0;
        } else {
            this.value = value;
        }
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if (value < 0 || value > 23) {
            return;
        }
        this.value = value;
    }
}
