package com.example.huytrinh.news.ui.mainscreen.newslist;

/**
 * Created by HUYTRINH on 2/11/2018.
 */

public class NewsListPresenter implements NewsListContract.Presenter {

    private NewsListContract.View view;

    @Override
    public void attachView(NewsListContract.View view) {
        this.view = view;
    }

    @Override
    public void detachView() {
        view = null;
    }

    @Override
    public void loadNewsList() {
    }
}
