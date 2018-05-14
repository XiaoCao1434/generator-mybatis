package com.beini.generatormybatis.pojo;

public class YlMenu {
    private Integer menuId;

    private String menuName;

    private String menuUrl;

    private Integer parentId;

    private Integer orderNum;

    private Integer type;

    private String menuNameEn;

    private String menuImage;

    private String menuColor;

    private String menuWin8Iamge;

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl == null ? null : menuUrl.trim();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getMenuNameEn() {
        return menuNameEn;
    }

    public void setMenuNameEn(String menuNameEn) {
        this.menuNameEn = menuNameEn == null ? null : menuNameEn.trim();
    }

    public String getMenuImage() {
        return menuImage;
    }

    public void setMenuImage(String menuImage) {
        this.menuImage = menuImage == null ? null : menuImage.trim();
    }

    public String getMenuColor() {
        return menuColor;
    }

    public void setMenuColor(String menuColor) {
        this.menuColor = menuColor == null ? null : menuColor.trim();
    }

    public String getMenuWin8Iamge() {
        return menuWin8Iamge;
    }

    public void setMenuWin8Iamge(String menuWin8Iamge) {
        this.menuWin8Iamge = menuWin8Iamge == null ? null : menuWin8Iamge.trim();
    }
}