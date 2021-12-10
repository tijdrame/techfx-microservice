package com.emard.microservices.productstockservice.techfxproductstockservice.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProductStock {
    @Id
    private Long id;
    private String productName;
    private BigDecimal productPrice;
    private String productAvailability;
    private Double discountOffer;


    public ProductStock() {
    }

    public ProductStock(Long id, String productName, BigDecimal productPrice, String productAvailability, Double discountOffer) {
        this.id = id;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productAvailability = productAvailability;
        this.discountOffer = discountOffer;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return this.productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public BigDecimal getProductPrice() {
        return this.productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductAvailability() {
        return this.productAvailability;
    }

    public void setProductAvailability(String productAvailability) {
        this.productAvailability = productAvailability;
    }

    public Double getDiscountOffer() {
        return this.discountOffer;
    }

    public void setDiscountOffer(Double discountOffer) {
        this.discountOffer = discountOffer;
    }

    public ProductStock id(Long id) {
        setId(id);
        return this;
    }

    public ProductStock productName(String productName) {
        setProductName(productName);
        return this;
    }

    public ProductStock productPrice(BigDecimal productPrice) {
        setProductPrice(productPrice);
        return this;
    }

    public ProductStock productAvailability(String productAvailability) {
        setProductAvailability(productAvailability);
        return this;
    }

    public ProductStock discountOffer(Double discountOffer) {
        setDiscountOffer(discountOffer);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", productName='" + getProductName() + "'" +
            ", productPrice='" + getProductPrice() + "'" +
            ", productAvailability='" + getProductAvailability() + "'" +
            ", discountOffer='" + getDiscountOffer() + "'" +
            "}";
    }
   
}
