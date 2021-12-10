package com.emard.microservices.productstockenquiryservice.techfxproductenquiryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.emard.microservices.productstockenquiryservice.techfxproductenquiryservice")
public class TechfxProductEnquiryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechfxProductEnquiryServiceApplication.class, args);
	}

}
