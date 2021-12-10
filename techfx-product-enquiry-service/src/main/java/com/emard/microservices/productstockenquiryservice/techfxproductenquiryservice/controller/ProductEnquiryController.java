package com.emard.microservices.productstockenquiryservice.techfxproductenquiryservice.controller;

import java.math.BigDecimal;

import com.emard.microservices.productstockenquiryservice.techfxproductenquiryservice.bean.ProductEnquiryBean;
import com.emard.microservices.productstockenquiryservice.techfxproductenquiryservice.client.ProductStockClient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductEnquiryController {
    
    private final ProductStockClient client;

    public ProductEnquiryController(ProductStockClient client){
        this.client = client;
    }

    @GetMapping("/product-enquiry/name/{name}/availability/{availability}/unit/{unit}")
    public ProductEnquiryBean getEnquiryOfProduct(@PathVariable String name, @PathVariable String availability, @PathVariable Integer unit){
        ProductEnquiryBean enquiryBean = client.checkProductStock(name, availability);
        enquiryBean.unit(unit).productName(name);
        enquiryBean.totalPrice(enquiryBean.getProductPrice().doubleValue()*unit);
        enquiryBean.discountOffer(enquiryBean.getTotalPrice()-enquiryBean.getTotalPrice()*enquiryBean.getDiscountOffer()/100);
        return enquiryBean;
    }
}
