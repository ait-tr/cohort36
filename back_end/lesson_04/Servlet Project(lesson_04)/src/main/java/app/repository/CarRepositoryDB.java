package app.repository;

import app.constants.Constants;
import app.domain.Car;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import static app.constants.Constants.*;

public class CarRepositoryDB implements CarRepository {

    // connectivity
    private Connection getConnection(){

        try {

            Class.forName(DB_DRIVER_PATH);

            // http://10.1.2.3:8080/carss?id=3
            // это URI для http-запроса, URI для подключения к БД выглядит аналогично:
            // jdbc:postgresql://localhost:5432/cars_db?user=postgres&password=ppp77777

            String dbUrl = String.format("%s%s?user=%s&password=%s", DB_ADDRESS, DB_NAME, DB_USERNAME, DB_PASSWORD );
            return DriverManager.getConnection(dbUrl);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public Car save(Car car) {
        try(Connection connection = getConnection()){
            String query = String.format("INSERT INTO car(brand, price, year) VALUES ('%s', '%s', %d);",car.getBrand(),car.getPrice(), car.getYear());
            Statement statement = connection.createStatement();
            statement.execute(query,Statement.RETURN_GENERATED_KEYS);
            ResultSet resultSet = statement.getGeneratedKeys();
            resultSet.next();
            // get ID from resultSet
            Long id = resultSet.getLong(1);
            car.setId(id);
            return car;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    @Override
    public Car getById(Long id) {
        try(Connection connection = getConnection()){


        } catch (Exception e){
            throw new RuntimeException();
        }
        return null;
    }

    @Override
    public List<Car> getAll() {
        try(Connection connection = getConnection()){



        } catch (Exception e){
            throw new RuntimeException();
        }
        return List.of();
    }

    @Override
    public Car updateCar() {
        try(Connection connection = getConnection()){



        } catch (Exception e){
            throw new RuntimeException();
        }
        return null;
    }

    @Override
    public void delete(Long id) {
        try(Connection connection = getConnection()){



        } catch (Exception e){
            throw new RuntimeException();
        }
    }
}
