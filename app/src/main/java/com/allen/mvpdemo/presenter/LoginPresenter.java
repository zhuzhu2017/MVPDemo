package com.allen.mvpdemo.presenter;

import android.os.Handler;

import com.allen.mvpdemo.listener.IUserActionImp;
import com.allen.mvpdemo.listener.OnLoginListener;
import com.allen.mvpdemo.model.UserBean;
import com.allen.mvpdemo.view.ILoginView;

/**
 * 登录presenter
 * Created by allen on 2017/12/21.
 */

public class LoginPresenter {

    private ILoginView loginView;
    private IUserActionImp userActionImp;
    private Handler mHandler = new Handler();

    public LoginPresenter(ILoginView iLoginView) {
        this.loginView = iLoginView;
        this.userActionImp = new IUserActionImp();
    }

    public void login() {
        loginView.showProgress();
        userActionImp.login(loginView.getUsername(), loginView.getPassword(), new OnLoginListener() {
            @Override
            public void loginSuccess(UserBean userBean) {
                mHandler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        loginView.hideProgress();
                        loginView.toNextActivity();
                    }
                }, 2000);
            }

            @Override
            public void loginFailed() {
                mHandler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        loginView.hideProgress();
                        loginView.loginFailed();
                    }
                }, 2000);
            }
        });
    }

    public void clear() {
        loginView.clearUsername();
        loginView.clearPassword();
    }

}
