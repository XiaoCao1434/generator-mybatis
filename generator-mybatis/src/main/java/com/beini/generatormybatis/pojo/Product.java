package com.beini.generatormybatis.pojo;

public class Product {
    private String proUuid;

    private Integer inregral;

    private Double maxPrice;

    private Double minPrice;

    private String pbUuid;

    private String pcUuid;

    private String pictureUrl;

    private String proMarque;

    private Integer status;

    private Integer stock;

    private Integer warningStock;

    public String getProUuid() {
        return proUuid;
    }

    public void setProUuid(String proUuid) {
        this.proUuid = proUuid == null ? null : proUuid.trim();
    }

    public Integer getInregral() {
        return inregral;
    }

    public void setInregral(Integer inregral) {
        this.inregral = inregral;
    }

    public Double getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(Double maxPrice) {
        this.maxPrice = maxPrice;
    }

    public Double getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(Double minPrice) {
        this.minPrice = minPrice;
    }

    public String getPbUuid() {
        return pbUuid;
    }

    public void setPbUuid(String pbUuid) {
        this.pbUuid = pbUuid == null ? null : pbUuid.trim();
    }

    public String getPcUuid() {
        return pcUuid;
    }

    public void setPcUuid(String pcUuid) {
        this.pcUuid = pcUuid == null ? null : pcUuid.trim();
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl == null ? null : pictureUrl.trim();
    }

    public String getProMarque() {
        return proMarque;
    }

    public void setProMarque(String proMarque) {
        this.proMarque = proMarque == null ? null : proMarque.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getWarningStock() {
        return warningStock;
    }

    public void setWarningStock(Integer warningStock) {
        this.warningStock = warningStock;
    }
}