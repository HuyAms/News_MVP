package com.example.huytrinh.news.di;

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
}
