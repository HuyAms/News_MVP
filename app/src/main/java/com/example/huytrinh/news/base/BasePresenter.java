package com.example.huytrinh.news.base;

/**
 * Created by HUYTRINH on 2/10/2018.
 */

public interface BasePresenter<T extends BaseView> {

    void attachView(T view);

    void detachView();
}
