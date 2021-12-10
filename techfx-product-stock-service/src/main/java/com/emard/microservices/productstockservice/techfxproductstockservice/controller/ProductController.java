package com.emard.microservices.productstockservice.techfxproductstockservice.controller;

import com.emard.microservices.productstockservice.techfxproductstockservice.bean.ProductStockBean;
import com.emard.microservices.productstockservice.techfxproductstockservice.entity.ProductStock;
import com.emard.microservices.productstockservice.techfxproductstockservice.entity.ProductStockRepository;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    private final ProductStockRepository repository;
    private final Environment environment;
    public ProductController(ProductStockRepository repository, Environment environment){
        this.repository = repository;
        this.environment = environment;
    }

    @GetMapping("/check-product-stock/productName/{productName}/productAvailability/{productAvailability}")
    public ProductStockBean checkProductStock(@PathVariable String productName, @PathVariable String productAvailability){
        ProductStock productStock = repository.findByProductNameAndProductAvailability(productName, productAvailability);
        ProductStockBean productStockBean = new ProductStockBean();
        if(productStock!=null && productStock.getId()!=null){
            productStockBean
            .id(productStock.getId())
            .productName(productStock.getProductName())
            .productPrice(productStock.getProductPrice())
            .productAvailability(productStock.getProductAvailability())
            .discountOffer(productStock.getDiscountOffer())
            .port(Integer.parseInt(environment.getProperty("local.server.port")));
        }
        return productStockBean;
    }
}
