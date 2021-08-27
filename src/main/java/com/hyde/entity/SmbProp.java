package com.hyde.entity;

import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

@TableName("smb_prop")
public class SmbProp implements Serializable {
    private Integer id;
    private Integer userId;
    private String host;
    private String username;
    private String password;

    public SmbProp() {
    }

    public SmbProp(Integer id, Integer userId, String host, String username, String password) {
        this.id = id;
        this.userId = userId;
        this.host = host;
        this.username = username;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
