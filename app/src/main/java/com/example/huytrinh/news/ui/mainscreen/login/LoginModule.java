package com.example.huytrinh.news.ui.mainscreen.login;

import dagger.Module;
import dagger.Provides;

/**
 * Created by HUYTRINH on 2/11/2018.
 */

@Module
public class LoginModule {

    @Provides
    public LoginContract.Presenter provideLoginPresenter() {
        return new LoginPresenter();
    }

}
