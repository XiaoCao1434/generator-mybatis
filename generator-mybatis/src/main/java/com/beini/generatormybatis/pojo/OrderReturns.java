package com.beini.generatormybatis.pojo;

import java.util.Date;

public class OrderReturns {
    private String orderReturnsUuid;

    private String consigneeAddress;

    private String consigneeRealname;

    private String consigneeTelphone;

    private String consigneeTelphone2;

    private String consigneeZip;

    private String expressNo;

    private Date handlingTime;

    private String handlingWay;

    private String orderUuid;

    private String proUuid;

    private String returnCase;

    private String returnClass;

    private Date returnSubmitTime;

    private Double returnsAmount;

    private String returnsType;

    private Double sellerPunishFee;

    public String getOrderReturnsUuid() {
        return orderReturnsUuid;
    }

    public void setOrderReturnsUuid(String orderReturnsUuid) {
        this.orderReturnsUuid = orderReturnsUuid == null ? null : orderReturnsUuid.trim();
    }

    public String getConsigneeAddress() {
        return consigneeAddress;
    }

    public void setConsigneeAddress(String consigneeAddress) {
        this.consigneeAddress = consigneeAddress == null ? null : consigneeAddress.trim();
    }

    public String getConsigneeRealname() {
        return consigneeRealname;
    }

    public void setConsigneeRealname(String consigneeRealname) {
        this.consigneeRealname = consigneeRealname == null ? null : consigneeRealname.trim();
    }

    public String getConsigneeTelphone() {
        return consigneeTelphone;
    }

    public void setConsigneeTelphone(String consigneeTelphone) {
        this.consigneeTelphone = consigneeTelphone == null ? null : consigneeTelphone.trim();
    }

    public String getConsigneeTelphone2() {
        return consigneeTelphone2;
    }

    public void setConsigneeTelphone2(String consigneeTelphone2) {
        this.consigneeTelphone2 = consigneeTelphone2 == null ? null : consigneeTelphone2.trim();
    }

    public String getConsigneeZip() {
        return consigneeZip;
    }

    public void setConsigneeZip(String consigneeZip) {
        this.consigneeZip = consigneeZip == null ? null : consigneeZip.trim();
    }

    public String getExpressNo() {
        return expressNo;
    }

    public void setExpressNo(String expressNo) {
        this.expressNo = expressNo == null ? null : expressNo.trim();
    }

    public Date getHandlingTime() {
        return handlingTime;
    }

    public void setHandlingTime(Date handlingTime) {
        this.handlingTime = handlingTime;
    }

    public String getHandlingWay() {
        return handlingWay;
    }

    public void setHandlingWay(String handlingWay) {
        this.handlingWay = handlingWay == null ? null : handlingWay.trim();
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

    public String getReturnCase() {
        return returnCase;
    }

    public void setReturnCase(String returnCase) {
        this.returnCase = returnCase == null ? null : returnCase.trim();
    }

    public String getReturnClass() {
        return returnClass;
    }

    public void setReturnClass(String returnClass) {
        this.returnClass = returnClass == null ? null : returnClass.trim();
    }

    public Date getReturnSubmitTime() {
        return returnSubmitTime;
    }

    public void setReturnSubmitTime(Date returnSubmitTime) {
        this.returnSubmitTime = returnSubmitTime;
    }

    public Double getReturnsAmount() {
        return returnsAmount;
    }

    public void setReturnsAmount(Double returnsAmount) {
        this.returnsAmount = returnsAmount;
    }

    public String getReturnsType() {
        return returnsType;
    }

    public void setReturnsType(String returnsType) {
        this.returnsType = returnsType == null ? null : returnsType.trim();
    }

    public Double getSellerPunishFee() {
        return sellerPunishFee;
    }

    public void setSellerPunishFee(Double sellerPunishFee) {
        this.sellerPunishFee = sellerPunishFee;
    }
}