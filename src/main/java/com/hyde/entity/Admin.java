package com.hyde.entity;

import java.io.Serializable;

public class Admin implements Serializable {
    private Integer UserId;
    private String UserLogin;
    private String PwdLogin;

    public Admin() {
    }

    public Admin(Integer userId, String userLogin, String pwdLogin) {
        UserId = userId;
        UserLogin = userLogin;
        PwdLogin = pwdLogin;
    }

    public Integer getUserId() {
        return UserId;
    }

    public void setUserId(Integer userId) {
        UserId = userId;
    }

    public String getUserLogin() {
        return UserLogin;
    }

    public void setUserLogin(String userLogin) {
        UserLogin = userLogin;
    }

    public String getPassWordLogin() {
        return PwdLogin;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "UserId=" + UserId +
                ", UserLogin='" + UserLogin + '\'' +
                ", PwdLogin='" + PwdLogin + '\'' +
                '}';
    }

    public void setPassWordLogin(String pwdLogin) {
        PwdLogin = pwdLogin;
    }
}
