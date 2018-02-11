package com.example.huytrinh.news.ui.mainscreen.newslist;

import com.example.huytrinh.news.ui.base.BasePresenter;
import com.example.huytrinh.news.ui.base.BaseView;

/**
 * Created by HUYTRINH on 2/11/2018.
 */

public interface MainContract {

    interface View extends BaseView {

    }

    interface Presenter extends BasePresenter<View> {
        void logInfo();
    }
}
