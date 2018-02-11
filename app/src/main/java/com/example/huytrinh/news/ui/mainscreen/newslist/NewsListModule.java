package com.example.huytrinh.news.ui.mainscreen.newslist;

import dagger.Module;
import dagger.Provides;

/**
 * Created by HUYTRINH on 2/11/2018.
 */

@Module
public class NewsListModule {

    @Provides
    public NewsListContract.Presenter provideNewsListPresenter() {
        return new NewsListPresenter();
    }
}
