package com.example.huytrinh.news.ui.mainscreen;

import com.example.huytrinh.news.ui.mainscreen.newslist.NewsListFragment;
import com.example.huytrinh.news.ui.mainscreen.newslist.NewsListModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by HUYTRINH on 2/11/2018.
 */

@Module
public abstract class NewsListProvider {

    @ContributesAndroidInjector(modules = NewsListModule.class)
    abstract NewsListFragment providerNewsListFragment();
}
