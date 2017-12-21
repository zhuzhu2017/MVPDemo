package com.allen.mvpdemo.listener;

import android.text.TextUtils;

import com.allen.mvpdemo.model.UserBean;

/**
 * 用户登录实现类
 * Created by allen on 2017/12/21.
 */

public class IUserActionImp implements IUserAction {
    @Override
    public void login(final String username, final String password, final OnLoginListener listener) {
        //模拟耗时操作
        new Thread() {
            @Override
            public void run() {
                //模拟登录成功
                if (TextUtils.equals(username, "gjw") && TextUtils.equals(password, "123")) {
                    UserBean userBean = new UserBean();
                    userBean.setUsername(username);
                    userBean.setPassword(password);
                    listener.loginSuccess(userBean);
                } else {
                    listener.loginFailed();
                }
            }
        }.start();
    }
}
