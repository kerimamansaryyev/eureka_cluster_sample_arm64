package com.example.product.model;

public class Product {
    private final String productNumber;
    private final String name;
    private final int stockCount;

    public Product(String productNumber, String name, int stockCount) {
        this.productNumber = productNumber;
        this.name = name;
        this.stockCount = stockCount;
    }

    public String getProductNumber() {
        return productNumber;
    }

    public String getName() {
        return name;
    }

    public int getStockCount() {
        return stockCount;
    }
}
