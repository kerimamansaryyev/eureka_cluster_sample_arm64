package com.example.stock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockServiceController {

    @Value("${static-configs.dummyStockQuantity}")
    private int dummyQuantity;

    @GetMapping("/stock/{productNumber}")
    public int getStockCount(@PathVariable String productNumber) {
        return dummyQuantity;
    }
}
