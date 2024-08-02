package service;

import domain.Car;
import repository.CarRepository;

import java.util.List;

public class CarServiceImpl implements CarService {

    private final CarRepository repository;

    public CarServiceImpl(CarRepository repository) {
        this.repository = repository;
    }

    @Override
    public Car save(Car car) {
        return repository.save(car);
    }

    @Override
    public Car getById(Long id) {
        return repository.getById(id);
    }

    @Override
    public List<Car> getAll() {
        return repository.getAll();
    }

    @Override
    public Car update(Car car) {
        return repository.update(car);
    }

    @Override
    public void delete(Long id) {
        repository.delete(id);
    }
}