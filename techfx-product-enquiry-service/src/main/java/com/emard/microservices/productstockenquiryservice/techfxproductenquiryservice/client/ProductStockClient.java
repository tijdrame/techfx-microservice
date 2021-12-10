package com.emard.microservices.productstockenquiryservice.techfxproductenquiryservice.client;

import com.emard.microservices.productstockenquiryservice.techfxproductenquiryservice.bean.ProductEnquiryBean;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="techefx-product-stock-service")
//@FeignClient(name="techefx-product-stock-service", url = "localhost:8800")
public interface ProductStockClient {
    
    @GetMapping("/check-product-stock/productName/{productName}/productAvailability/{productAvailability}")
    public ProductEnquiryBean checkProductStock(@PathVariable String productName, @PathVariable String productAvailability);
}
