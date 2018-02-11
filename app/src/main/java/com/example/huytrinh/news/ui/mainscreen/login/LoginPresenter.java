package com.example.huytrinh.news.ui.mainscreen.login;

/**
 * Created by HUYTRINH on 2/11/2018.
 */

public class LoginPresenter implements LoginContract.Presenter {
    private LoginContract.View view;

    @Override
    public void attachView(LoginContract.View view) {
        this.view = view;
    }

    @Override
    public void detachView() {
        view = null;
    }

    @Override
    public void performLogin(String username, String password) {
        String correctUserName = "username";
        String correctPassword = "password";

        if (username.equals(correctUserName) && password.equals(correctPassword)) {
            view.onLoginSuccess();
        } else {
            view.onLoginFailure("Username or password is not correct!");
        }
    }
}
