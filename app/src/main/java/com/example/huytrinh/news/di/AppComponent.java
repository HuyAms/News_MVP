package com.example.huytrinh.news.di;

import android.app.Application;

import com.example.huytrinh.news.App;
import com.example.huytrinh.news.di.module.ApiModule;
import com.example.huytrinh.news.di.module.AppModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

/**
 * Created by HUYTRINH on 2/11/2018.
 */

@Singleton
@Component(modules = {
        AndroidInjectionModule.class,
        AppModule.class,
        ActivityBuilder.class,
        ApiModule.class
})
public interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);
        AppComponent build();
    }

    void inject(App app);
}
