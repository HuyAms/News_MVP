package com.example.huytrinh.news.ui.mainscreen.newslist;

import com.example.huytrinh.news.data.model.MyResponse;
import com.example.huytrinh.news.ui.base.BasePresenter;
import com.example.huytrinh.news.ui.base.BaseView;

/**
 * Created by HUYTRINH on 2/11/2018.
 */

public interface NewsListContract {

    interface View extends BaseView{

        void onShowLoading();

        void onHideLoading();

        void onLoadNewsListSuccess(MyResponse myResponse);

        void onLoadNewsListFailure(String error);
    }

    interface Presenter extends BasePresenter<View> {

        void loadNewsList();

    }
}
