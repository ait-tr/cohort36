package app.controller;

import app.domain.Car;
import app.repository.CarRepositoryDB;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import app.repository.CarRepository;
import app.repository.CarRepositoryMap;

import java.io.IOException;
import java.util.List;

public class CarServlet extends HttpServlet {

    // public CarRepository repository = new CarRepositoryMap();
    public CarRepository repository = new CarRepositoryDB();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // super.doGet(req, resp);
        List<Car> cars = repository.getAll();
        cars.forEach(x->{
            try {
                resp.getWriter().write(x.toString() + "\n");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // save new car in DB
        ObjectMapper mapper = new ObjectMapper();
        Car car = mapper.readValue(req.getReader(), Car.class);
        repository.save(car);
        resp.getWriter().write(car.toString());
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Для изменения существующего автомобиля в БД

        // TODO Домашнее задание:
        // Реализовать изменение объекта автомобиля в БД
        // (при этом меняться должна только цена)
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Для удаления автомобиля из БД

        // TODO Домашнее задание:
        // Реализовать удаление автомобиля из БД по id
    }
}
