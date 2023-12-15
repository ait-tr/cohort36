package classwork.example04;

public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("This is my laptop\n");
        SmartPhone smartPhone = new SmartPhone("This is my smartphone\n");

        laptop.sendData(smartPhone, "Hello from laptop\n");
        System.out.println(laptop);
        System.out.println(smartPhone);
    }
}
