package app.repository;

import app.domain.Car;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarRepositoryMap implements CarRepository{

    private final Map<Long, Car> database = new HashMap<>();
    private long currentId; // imitate DB

    public CarRepositoryMap(){
        save(new Car("Volkswagen", new BigDecimal(10_000), 2010));
        save(new Car("Mazda", new BigDecimal(30_000), 2015));
        save(new Car("Honda", new BigDecimal(50_000), 2020));
    }


    @Override
    public Car save(Car car) {
        car.setId(++currentId);
        database.put(currentId, car);
        return car;
    }

    @Override
    public Car getById(Long id) {
        return database.get(id);
    }

    @Override
    public List<Car> getAll() {
        return new ArrayList<>(database.values());
    }

    @Override
    public Car updateCar() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
