package com.example.huytrinh.news.ui.mainscreen.login;

import com.example.huytrinh.news.ui.base.BasePresenter;
import com.example.huytrinh.news.ui.base.BaseView;

/**
 * Created by HUYTRINH on 2/11/2018.
 */

public interface LoginContract {

    interface View extends BaseView {

        void onLoginSuccess();

        void onLoginFailure(String error);
    }

    interface Presenter extends BasePresenter<View> {

        void performLogin(String username, String password);

    }
}
