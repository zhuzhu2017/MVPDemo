package com.allen.mvpdemo.listener;

import com.allen.mvpdemo.model.UserBean;

/**
 * 登录结果回调
 * Created by allen on 2017/12/21.
 */

public interface OnLoginListener {
    void loginSuccess(UserBean userBean);

    void loginFailed();
}
