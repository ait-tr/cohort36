package src.app.domain;

import java.math.BigDecimal;
import java.util.Objects;

public class Product {

    private Long id;
    private String title;
    private BigDecimal price;
    private String article;

    public Product(Long id, String title, BigDecimal price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return Objects.equals(id, product.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return String.format("Product: id - %d, title - %s, price - %s, article - %s",
                id, title, price, article);
    }
}