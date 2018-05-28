package com.beini.generatormybatis.pojo;

public class OrderLogistics {
    private String orderLogUuid;

    private String consigneeAddress;

    private String consigneeRealname;

    private String consigneeTelphone;

    private String consigneeTelphone2;

    private String expressNo;

    private String orderUuid;

    private String zip;

    public String getOrderLogUuid() {
        return orderLogUuid;
    }

    public void setOrderLogUuid(String orderLogUuid) {
        this.orderLogUuid = orderLogUuid == null ? null : orderLogUuid.trim();
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

    public String getExpressNo() {
        return expressNo;
    }

    public void setExpressNo(String expressNo) {
        this.expressNo = expressNo == null ? null : expressNo.trim();
    }

    public String getOrderUuid() {
        return orderUuid;
    }

    public void setOrderUuid(String orderUuid) {
        this.orderUuid = orderUuid == null ? null : orderUuid.trim();
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip == null ? null : zip.trim();
    }
}