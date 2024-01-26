package com.example.stock.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockServiceController {

    @GetMapping("/stock/{productNumber}")
    public int getStockCount(@PathVariable String productNumber) {
        return 100;
    }
}
