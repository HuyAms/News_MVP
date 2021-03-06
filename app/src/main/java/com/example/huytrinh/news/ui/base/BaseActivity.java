package com.example.huytrinh.news.ui.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import dagger.android.AndroidInjection;

/**
 * Created by HUYTRINH on 2/10/2018.
 */

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        performDependencyInjection();
    }

    private void performDependencyInjection() {
        AndroidInjection.inject(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
