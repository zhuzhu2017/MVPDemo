package com.allen.mvpdemo.view;

/**
 * 登录页面View
 * Created by allen on 2017/12/21.
 */

public interface ILoginView {
    /**
     * 获取用户名
     *
     * @return
     */
    String getUsername();

    /**
     * 获取密码
     *
     * @return
     */
    String getPassword();

    /**
     * 显示加载框
     */
    void showProgress();

    /**
     * 隐藏加载框
     */
    void hideProgress();

    /**
     * 操作成功跳转到下一个页面
     */
    void toNextActivity();

    /**
     * 登陆失败
     */
    void loginFailed();

    /**
     * 清空用户名
     */
    void clearUsername();

    /**
     * 清空密码
     */
    void clearPassword();
}
