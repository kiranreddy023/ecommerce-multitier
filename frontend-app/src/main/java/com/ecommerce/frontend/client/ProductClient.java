package com.ecommerce.frontend.client;

import com.ecommerce.frontend.model.Product;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductClient {

    @Value("${backend.url:http://localhost:8080}")
    private String backendUrl;

    public List<Product> getProducts() {
        RestTemplate restTemplate = new RestTemplate();
        Product[] products = restTemplate.getForObject(
                backendUrl + "/api/products",
                Product[].class
        );
        return Arrays.asList(products);
    }
}