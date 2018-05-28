package com.beini.generatormybatis.pojo;

public class OrderDetail {
    private String orderDetailUuid;

    private Double discountAmount;

    private Double discountRate;

    private Double number;

    private String orderUuid;

    private String proUuid;

    private String productModeDesc;

    private String productModeParams;

    private String productPrice;

    private String remark;

    public String getOrderDetailUuid() {
        return orderDetailUuid;
    }

    public void setOrderDetailUuid(String orderDetailUuid) {
        this.orderDetailUuid = orderDetailUuid == null ? null : orderDetailUuid.trim();
    }

    public Double getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(Double discountAmount) {
        this.discountAmount = discountAmount;
    }

    public Double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(Double discountRate) {
        this.discountRate = discountRate;
    }

    public Double getNumber() {
        return number;
    }

    public void setNumber(Double number) {
        this.number = number;
    }

    public String getOrderUuid() {
        return orderUuid;
    }

    public void setOrderUuid(String orderUuid) {
        this.orderUuid = orderUuid == null ? null : orderUuid.trim();
    }

    public String getProUuid() {
        return proUuid;
    }

    public void setProUuid(String proUuid) {
        this.proUuid = proUuid == null ? null : proUuid.trim();
    }

    public String getProductModeDesc() {
        return productModeDesc;
    }

    public void setProductModeDesc(String productModeDesc) {
        this.productModeDesc = productModeDesc == null ? null : productModeDesc.trim();
    }

    public String getProductModeParams() {
        return productModeParams;
    }

    public void setProductModeParams(String productModeParams) {
        this.productModeParams = productModeParams == null ? null : productModeParams.trim();
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice == null ? null : productPrice.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}