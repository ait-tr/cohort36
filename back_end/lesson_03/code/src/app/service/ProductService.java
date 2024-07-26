package app.service;

import app.domain.Product;

public interface ProductService {

    Product getById(Long id);
}