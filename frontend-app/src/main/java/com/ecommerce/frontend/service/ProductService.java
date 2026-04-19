package com.ecommerce.frontend.service;

import com.ecommerce.frontend.client.ProductClient;
import com.ecommerce.frontend.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductClient client;

    public List<Product> getAllProducts() {
        return client.getProducts();
    }
}