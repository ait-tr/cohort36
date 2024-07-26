package app.repository;

import app.domain.Product;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepositoryList implements ProductRepository{

    private final List<Product> database = new ArrayList<>();

    public ProductRepositoryList() {
        database.add(new Product(1L, "Banana", new BigDecimal(170)));
        database.add(new Product(2L, "Apple", new BigDecimal(90)));
        database.add(new Product(3L, "Orange", new BigDecimal(210)));
    }

    @Override
    public Product getById(Long id) {
        return database
                .stream()
                .filter(x -> x.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}