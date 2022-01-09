package com.vyatsu.task14.repositories;

import com.vyatsu.task14.entities.Product;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class ProductRepository {
    private List<Product> products;

    @PostConstruct
    public void init() {
        products = new ArrayList<>();
        products.add(new Product(1L, "Bread", 40));
        products.add(new Product(2L, "Milk", 90));
        products.add(new Product(3L, "Cheese", 200));
    }

    public List<Product> findAll() {
        return products;
    }

    public Product findByTitle(String title) {
        return products.stream().filter(p -> p.getTitle().equals(title)).findFirst().get();
    }

    public Product findById(Long id) {
        try
        {
            return products.stream().filter(p -> p.getId().equals(id)).findFirst().get();
        }
        catch(Exception e)
        {
            return null;
        }
    }

    public void save(Product product) {
        products.add(product);
    }
    public void change(Product product) {
        for(Product p: products)
        {
            if(p.getId().equals(product.getId()))
            {
                p.setPrice(product.getPrice());
                p.setTitle(product.getTitle());
                return;
            }
        }
    }
}
