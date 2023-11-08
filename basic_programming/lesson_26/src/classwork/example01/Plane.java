package classwork.example01;

public class Plane {
    String model;
    boolean isPassenger;
    int seats;
    int distance; // in km
    int speed; // in km/h
    int wingspan; // in m
    double payload; // in tonnes
    int flightHeight; // in meters


    // конструктор с параметрами
    public Plane(String model, boolean isPassenger, int seats, int distance, int speed,
                 int wingspan, double payload, int flightHeight) {
        this.model = model;
        this.isPassenger = isPassenger;
        this.seats = seats;
        this.distance = distance;
        this.speed = speed;
        this.wingspan = wingspan;
        this.payload = payload;
        this.flightHeight = flightHeight;
    }

    // конструктор по умолчанию
    public Plane() {
        // здесь просто вызываем другой конструктор и передаем в него значения по умолчанию
        this("sample plane", true, 10, 100, 300, 10, 0.5, 1000);
    }
}
