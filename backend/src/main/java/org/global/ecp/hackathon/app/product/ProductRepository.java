package org.global.ecp.hackathon.app.product;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.global.ecp.hackathon.app.product.model.Product;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {

    private final Map<Long, Product> products;

    public ProductRepository() {
        products = new HashMap<>();

        // TODO - Task 14: remove this method
        populateProductsMap();
    }

    // TODO - Task 14: remove this method
    private void populateProductsMap() {

        Product product1 = new Product(1, "Millennium Vinyl", "Hackstreet Vinyl", 1.0);
        Product product2 = new Product(2, "Hackstreet Boys T-shirt", "Best T-shirt Ever", 2.0);
        Product product3 = new Product(3, "Hackstreet Cassette", "Cassette", 3.0);
        products.put(product1.getId(), product1);
        products.put(product2.getId(), product2);
        products.put(product3.getId(), product3);
    }

    public List<Product> getAll() {

        return products.values().stream().toList();
    }

    public Product getById(final Long id) {

        return products.get(id);
    }

    public Product add(final Product product) {

        return products.put(product.getId(), product);
    }

    public void deleteById(final Long id) {

        products.remove(id);
    }
}
