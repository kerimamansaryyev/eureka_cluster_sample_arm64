package com.example.product.controller;

import com.example.product.feign.StockServiceClient;
import com.example.product.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    private final StockServiceClient stockServiceClient;

    @Autowired
    public ProductController(StockServiceClient stockServiceClient) {
        this.stockServiceClient = stockServiceClient;
    }

    @RequestMapping( value = "/product/{productNumber}", method = RequestMethod.GET)
    public Product getProduct(@PathVariable String productNumber) {
        // Call StockService using Feign to get stock count
        int stockCount = stockServiceClient.getStockCount(productNumber);

        // Create Product with dummy data
        return new Product(productNumber, "Sample Product", stockCount);
    }
}
