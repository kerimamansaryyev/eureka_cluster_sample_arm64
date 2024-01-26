package com.example.product.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "stock-service", url = "http://localhost:8900")
@Component
public interface StockServiceClient {

    @GetMapping("/stock/{productNumber}")
    int getStockCount(@PathVariable String productNumber);
}
