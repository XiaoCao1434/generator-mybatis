package com.beini.generatormybatis.pojo;

import java.util.Date;

public class YlUser {
    private String userCode;

    private Integer id;

    private String userName;

    private String userPassword;

    private String yunbiaoUserCode;

    private String yunbiaoUserPassword;

    private String nickName;

    private String email;

    private String userMobile;

    private String userPhone;

    private Integer userType;

    private Integer userStatus;

    private String userHeader;

    private Date createTime;

    private String createAccount;

    private Date updateTime;

    private String updateAccount;

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode == null ? null : userCode.trim();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getYunbiaoUserCode() {
        return yunbiaoUserCode;
    }

    public void setYunbiaoUserCode(String yunbiaoUserCode) {
        this.yunbiaoUserCode = yunbiaoUserCode == null ? null : yunbiaoUserCode.trim();
    }

    public String getYunbiaoUserPassword() {
        return yunbiaoUserPassword;
    }

    public void setYunbiaoUserPassword(String yunbiaoUserPassword) {
        this.yunbiaoUserPassword = yunbiaoUserPassword == null ? null : yunbiaoUserPassword.trim();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile == null ? null : userMobile.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    public String getUserHeader() {
        return userHeader;
    }

    public void setUserHeader(String userHeader) {
        this.userHeader = userHeader == null ? null : userHeader.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateAccount() {
        return createAccount;
    }

    public void setCreateAccount(String createAccount) {
        this.createAccount = createAccount == null ? null : createAccount.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateAccount() {
        return updateAccount;
    }

    public void setUpdateAccount(String updateAccount) {
        this.updateAccount = updateAccount == null ? null : updateAccount.trim();
    }
}