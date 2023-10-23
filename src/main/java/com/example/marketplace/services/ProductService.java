package com.example.marketplace.services;

import com.example.marketplace.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    List<Product> products = new ArrayList<>();
    private long ID = 0;

    {
        products.add(new Product(++ID, "PS5", "New", 25000, "Kostopil", "Andrii"));
        products.add(new Product(++ID, "Iphone 15 pro", "New", 70000, "Kostopil", "Andrii"));

    }

    public List<Product> listProducts() {
        return products;
    }

    public void saveProduct(Product product) {
        product.setId(++ID);
        products.add(product);
    }

    public void deleteProduct(Long id) {
        products.removeIf(product -> product.getId().equals(id));
    }

    public Object getProductById(Long id) {
        for(Product product : products){
            if(product.getId().equals(id)) return product;
        }
        return null;
    }
}
