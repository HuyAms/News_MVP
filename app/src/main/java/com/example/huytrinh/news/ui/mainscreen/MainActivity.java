package com.example.huytrinh.news.ui.mainscreen;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.example.huytrinh.news.R;
import com.example.huytrinh.news.ui.base.BaseActivity;
import com.example.huytrinh.news.ui.mainscreen.newsdetail.NewsDetailFragment;
import com.example.huytrinh.news.ui.mainscreen.newslist.NewsListAdapter;
import com.example.huytrinh.news.ui.mainscreen.newslist.NewsListFragment;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.HasSupportFragmentInjector;

public class MainActivity extends BaseActivity implements HasSupportFragmentInjector, NewsListAdapter.NewsListAdapterCallBack {

    @Inject
    DispatchingAndroidInjector<Fragment> fragmentDispatchingAndroidInjector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.container, new NewsListFragment())
                .commit();
    }

    @Override
    public AndroidInjector<Fragment> supportFragmentInjector() {
        return fragmentDispatchingAndroidInjector;
    }

    @Override
    public void startNewsDatail(String url) {
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.container, NewsDetailFragment.newInstance(url))
                .addToBackStack("newsDetail")
                .commit();
    }
}
