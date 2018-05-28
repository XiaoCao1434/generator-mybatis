package com.beini.generatormybatis.pojo;

import java.util.Date;

public class Order {
    private String orderUuid;

    private Date createTime;

    private String deAdUuid;

    private Double logisticsFee;

    private String openId;

    private Double orderAmountTotal;

    private Integer orderStatus;

    private String orderlogisticsNo;

    private String outTradeNo;

    private String payChannel;

    private Double productAmountTotal;

    private Date sendTime;

    private String shopUuid;

    public String getOrderUuid() {
        return orderUuid;
    }

    public void setOrderUuid(String orderUuid) {
        this.orderUuid = orderUuid == null ? null : orderUuid.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getDeAdUuid() {
        return deAdUuid;
    }

    public void setDeAdUuid(String deAdUuid) {
        this.deAdUuid = deAdUuid == null ? null : deAdUuid.trim();
    }

    public Double getLogisticsFee() {
        return logisticsFee;
    }

    public void setLogisticsFee(Double logisticsFee) {
        this.logisticsFee = logisticsFee;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    public Double getOrderAmountTotal() {
        return orderAmountTotal;
    }

    public void setOrderAmountTotal(Double orderAmountTotal) {
        this.orderAmountTotal = orderAmountTotal;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderlogisticsNo() {
        return orderlogisticsNo;
    }

    public void setOrderlogisticsNo(String orderlogisticsNo) {
        this.orderlogisticsNo = orderlogisticsNo == null ? null : orderlogisticsNo.trim();
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo == null ? null : outTradeNo.trim();
    }

    public String getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel == null ? null : payChannel.trim();
    }

    public Double getProductAmountTotal() {
        return productAmountTotal;
    }

    public void setProductAmountTotal(Double productAmountTotal) {
        this.productAmountTotal = productAmountTotal;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public String getShopUuid() {
        return shopUuid;
    }

    public void setShopUuid(String shopUuid) {
        this.shopUuid = shopUuid == null ? null : shopUuid.trim();
    }
}