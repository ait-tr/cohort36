package app.domain;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

public class Car {
    private Long id;
    private BigDecimal price;
    private String brand;
    private int year;

    public Car(String brand, BigDecimal price,  int year) {
        this.price = price;
        this.brand = brand;
        this.year = year;
    }

    public Car() {
    }

    public Car(Long id, BigDecimal price, String brand, int year) {
        this.id = id;
        this.price = price;
        this.brand = brand;
        this.year = year;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return Objects.equals(id, car.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    public String toString() {
        return String.format("Car: id - %d, brand - %s, price - %s, year - %d",
                id, brand, price, year);
    }
}
