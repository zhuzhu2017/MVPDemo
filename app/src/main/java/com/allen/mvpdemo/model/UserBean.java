package com.allen.mvpdemo.model;

import java.io.Serializable;

/**
 * 用户数据对象
 * Created by allen on 2017/12/21.
 */

public class UserBean implements Serializable {
    private String username;
    private String password;

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
