package com.example.huytrinh.news.di.module;

import com.example.huytrinh.news.data.api.NewsApiService;
import com.example.huytrinh.news.util.Constants;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by HUYTRINH on 2/11/2018.
 */

@Module
public class ApiModule {

    @Provides
    @Singleton
    public OkHttpClient provideOkHttpClient() {
        return new OkHttpClient.Builder().build();
    }

    @Provides
    @Singleton
    public GsonConverterFactory provideGsonConverterFactory() {
        return GsonConverterFactory.create();
    }

    @Provides
    @Singleton
    public Retrofit provideRetrofit(OkHttpClient okHttpClient, GsonConverterFactory gsonConverterFactory) {
        Retrofit.Builder builder = new Retrofit.Builder();
        builder.client(okHttpClient)
                .baseUrl(Constants.BASE_URL)
                .addConverterFactory(gsonConverterFactory);
        return builder.build();
    }

    @Provides
    @Singleton
    public NewsApiService provideApiService(Retrofit retrofit) {
        return retrofit.create(NewsApiService.class);
    }

}
