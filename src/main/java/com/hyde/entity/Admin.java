package com.hyde.entity;

import java.io.Serializable;

public class Admin implements Serializable {
    private Integer UserId;
    private String UserLogin;
    private String PassWordLogin;

    public Admin() {
    }

    public Admin(Integer userId, String userLogin, String passWordLogin) {
        UserId = userId;
        UserLogin = userLogin;
        PassWordLogin = passWordLogin;
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
        return PassWordLogin;
    }

    public void setPassWordLogin(String passWordLogin) {
        PassWordLogin = passWordLogin;
    }
}
