package app.domain;

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
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id) && Objects.equals(title, product.title) && Objects.equals(price, product.price) && Objects.equals(article, product.article);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, price, article);
    }

    @Override
    public String toString() {
        return String.format("Product: id - %d, title - %s, price - %s, article - %s",
                id, title, price, article);
    }
}