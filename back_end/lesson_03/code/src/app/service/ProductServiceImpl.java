package app.service;

import app.domain.Product;
import app.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

@Service
@PropertySource("classpath:application.properties")
public class ProductServiceImpl implements ProductService {

    private final ProductRepository repository;
    private final String articlePrefix;

    public ProductServiceImpl(
            @Qualifier("productRepositoryList") ProductRepository repository,
            @Value("${article.prefix}") String articlePrefix
    ) {
        this.repository = repository;
        this.articlePrefix = articlePrefix;
    }

    @Override
    public Product getById(Long id) {
        Product product = repository.getById(id);
        setArticle(product);
        return product;
    }

    private void setArticle(Product product) {
        String article = String.format("%s-%s-%d",
                articlePrefix, product.getTitle().charAt(0), product.getId());
        product.setArticle(article);
    }
}