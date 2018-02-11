package com.example.huytrinh.news.ui.mainscreen.newslist;

import com.example.huytrinh.news.data.DataManager;

import dagger.Module;
import dagger.Provides;

/**
 * Created by HUYTRINH on 2/11/2018.
 */

@Module
public class NewsListModule {

    @Provides
    public NewsListContract.Presenter provideNewsListPresenter(DataManager dataManager) {
        return new NewsListPresenter(dataManager);
    }
}
