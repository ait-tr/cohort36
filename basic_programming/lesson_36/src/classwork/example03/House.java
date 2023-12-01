package classwork.example03;

public class House {
    private double square; // in meters square
    private double rentPrice;
    private char energyClass;
    private int rooms;
    private boolean garage;
    private double landArea; // in 100m^2
    private int floors;

    public House() {
        this.square = -1;
        this.rentPrice = 0;
        this.energyClass = EnergyClassProvider.NOT_DEFINED;
        this.rooms = 0;
        this.garage = false;
        this.landArea = -1;
        this.floors = -1;
    }

    public House(double square, double rentPrice, char energyClass, int rooms, boolean garage, double landArea, int floors) {
        this.square = square;
        this.rentPrice = rentPrice;
        this.energyClass = energyClass;
        this.rooms = rooms;
        this.garage = garage;
        this.landArea = landArea;
        this.floors = floors;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public double getRentPrice() {
        return rentPrice;
    }

    public void setRentPrice(double rentPrice) {
        this.rentPrice = rentPrice;
    }

    public char getEnergyClass() {
        return energyClass;
    }

    public void setEnergyClass(char energyClass) {
        this.energyClass = energyClass;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public boolean isGarage() {
        return garage;
    }

    public void setGarage(boolean garage) {
        this.garage = garage;
    }

    public double getLandArea() {
        return landArea;
    }

    public void setLandArea(double landArea) {
        this.landArea = landArea;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }
}
