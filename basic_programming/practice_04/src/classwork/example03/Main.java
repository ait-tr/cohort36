package classwork.example03;

public class Main {
 /*
 Разработать иерархию классов для транспорта
  */
    public static void main(String[] args) {
        Bicycle myBicycle = new Bicycle(20, "20.01.2020", 7, "MTB");
        myBicycle.ride();

        Car myCar = new Car(5, 80, "01.03.2019", "Tesla model Y", "Electric");
        myCar.ride();

        Truck myTruck = new Truck(2, 60, "05.08.2011", "Volvo FH15", "Diesel", 40000);
        myTruck.ride();
    }
}
