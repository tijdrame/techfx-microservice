package com.emard.microservices.productstockservice.techfxproductstockservice.bean;

import java.math.BigDecimal;

public class ProductStockBean {

    private Long id;
    private String productName;
    private BigDecimal productPrice;
    private String productAvailability;
    private Double discountOffer;
    private Integer port;


    public ProductStockBean() {
    }

    public ProductStockBean(Long id, String productName, BigDecimal productPrice, String productAvailability, Double discountOffer, Integer port) {
        this.id = id;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productAvailability = productAvailability;
        this.discountOffer = discountOffer;
        this.port = port;
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

    public Integer getPort() {
        return this.port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public ProductStockBean id(Long id) {
        setId(id);
        return this;
    }

    public ProductStockBean productName(String productName) {
        setProductName(productName);
        return this;
    }

    public ProductStockBean productPrice(BigDecimal productPrice) {
        setProductPrice(productPrice);
        return this;
    }

    public ProductStockBean productAvailability(String productAvailability) {
        setProductAvailability(productAvailability);
        return this;
    }

    public ProductStockBean discountOffer(Double discountOffer) {
        setDiscountOffer(discountOffer);
        return this;
    }

    public ProductStockBean port(Integer port) {
        setPort(port);
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
            ", port='" + getPort() + "'" +
            "}";
    }
    

}
