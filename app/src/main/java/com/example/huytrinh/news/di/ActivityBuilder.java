package com.example.huytrinh.news.di;

import com.example.huytrinh.news.ui.mainscreen.login.LoginActivity;
import com.example.huytrinh.news.ui.mainscreen.login.LoginModule;
import com.example.huytrinh.news.ui.mainscreen.MainActivity;
import com.example.huytrinh.news.ui.mainscreen.NewsListProvider;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by HUYTRINH on 2/11/2018.
 */

@Module
public abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = {NewsListProvider.class})
    abstract MainActivity bindMainAvtivity();

    @ContributesAndroidInjector(modules = LoginModule.class)
    abstract LoginActivity bindLoginActivity();
}
