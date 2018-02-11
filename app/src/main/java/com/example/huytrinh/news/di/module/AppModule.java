package com.example.huytrinh.news.di.module;

import android.app.Application;
import android.content.Context;

import com.example.huytrinh.news.data.DataManager;
import com.example.huytrinh.news.data.api.NewsApiService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by HUYTRINH on 2/11/2018.
 */

@Module
public class AppModule {

    @Provides
    @Singleton
    Context provideContext(Application application) {
        return application;
    }

    @Provides
    @Singleton
    DataManager provideDataManager(NewsApiService newsApiService) {
        return new DataManager(newsApiService);
    }
}
