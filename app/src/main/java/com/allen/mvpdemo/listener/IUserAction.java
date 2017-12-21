package com.allen.mvpdemo.listener;

/**
 * 用户对象操作接口
 * Created by allen on 2017/12/21.
 */

public interface IUserAction {
    /**
     * 用户登录操作
     * @param username  用户名
     * @param password  密码
     * @param listener  登录结果回调
     */
    void login(String username, String password, OnLoginListener listener);
}
