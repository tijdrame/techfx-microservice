package com.emard.microservices.productstockservice.techfxproductstockservice;

import java.math.BigDecimal;

import com.emard.microservices.productstockservice.techfxproductstockservice.entity.ProductStock;
import com.emard.microservices.productstockservice.techfxproductstockservice.entity.ProductStockRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TechfxProductStockServiceApplication implements CommandLineRunner {

	@Autowired
	private ProductStockRepository repository;
    
	public static void main(String[] args) {
		SpringApplication.run(TechfxProductStockServiceApplication.class, args);
	}

	

	@Override
	public void run(String... args) throws Exception {
		ProductStock p1 = new ProductStock(1001l, "bat", BigDecimal.valueOf(5000), "yes", 20d);
        ProductStock p2 = new ProductStock(1002l, "ball", BigDecimal.valueOf(500), "yes", 40d);
        ProductStock p3 = new ProductStock(1003l, "helmet", BigDecimal.valueOf(5000), "yes", 30d);
        repository.save(p1);
        repository.save(p2);
        repository.save(p3);
	}

}
