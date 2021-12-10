package com.emard.microservices.productstockenquiryservice.techfxproductenquiryservice.bean;

import java.math.BigDecimal;

public class ProductEnquiryBean {
    private Long id;
    private String productName;
    private BigDecimal productPrice;
    private String productAvailability;
    private Double discountOffer;
    private Integer unit;
    private Double totalPrice;
    private Integer port;

    public ProductEnquiryBean() {
    }

    public ProductEnquiryBean(Long id, String productName, BigDecimal productPrice, String productAvailability, Double discountOffer, Integer unit, Double totalPrice, Integer port) {
        this.id = id;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productAvailability = productAvailability;
        this.discountOffer = discountOffer;
        this.unit = unit;
        this.totalPrice = totalPrice;
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

    public Integer getUnit() {
        return this.unit;
    }

    public void setUnit(Integer unit) {
        this.unit = unit;
    }

    public Double getTotalPrice() {
        return this.totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Integer getPort() {
        return this.port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public ProductEnquiryBean id(Long id) {
        setId(id);
        return this;
    }

    public ProductEnquiryBean productName(String productName) {
        setProductName(productName);
        return this;
    }

    public ProductEnquiryBean productPrice(BigDecimal productPrice) {
        setProductPrice(productPrice);
        return this;
    }

    public ProductEnquiryBean productAvailability(String productAvailability) {
        setProductAvailability(productAvailability);
        return this;
    }

    public ProductEnquiryBean discountOffer(Double discountOffer) {
        setDiscountOffer(discountOffer);
        return this;
    }

    public ProductEnquiryBean unit(Integer unit) {
        setUnit(unit);
        return this;
    }

    public ProductEnquiryBean totalPrice(Double totalPrice) {
        setTotalPrice(totalPrice);
        return this;
    }

    public ProductEnquiryBean port(Integer port) {
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
            ", unit='" + getUnit() + "'" +
            ", totalPrice='" + getTotalPrice() + "'" +
            ", port='" + getPort() + "'" +
            "}";
    }
    
}
