package classwork.example02;

import java.io.IOException;
import java.io.OutputStream;

public class Main {
    /*
    Сделать интерфейс, который будет позволять выводить приветствие на разных языках
     */

    public static void main(String[] args) {
        Greeter englishGreeter = new Greeter() {
            @Override
            public void sayHello() {
                System.out.println("Hello");
            }
        };
        Greeter russianGreeter = new Greeter() {
            @Override
            public void sayHello() {
                System.out.println("Привет");
            }
        };
        Greeter ukrainianGreeter = new Greeter() {
            @Override
            public void sayHello() {
                System.out.println("Привіт");
            }
        };
        Greeter frenchGreeter = new Greeter() {
            @Override
            public void sayHello() {
                System.out.println("Bonjour");
            }
        };
        englishGreeter.sayHello();
        frenchGreeter.sayHello();
        russianGreeter.sayHello();
        ukrainianGreeter.sayHello();

    }
}
