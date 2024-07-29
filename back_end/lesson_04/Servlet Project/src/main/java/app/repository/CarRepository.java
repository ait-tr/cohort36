package app.repository;

import app.domain.Car;

import java.util.List;

public interface CarRepository {

    Car save(Car car);

    Car getById(Long id);

    List<Car> getAll();

    Car updateCar();

    void delete(Long id);

}
