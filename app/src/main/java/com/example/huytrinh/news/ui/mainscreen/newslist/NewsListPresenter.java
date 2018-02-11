package com.example.huytrinh.news.ui.mainscreen.newslist;

import com.example.huytrinh.news.data.ApiCallback;
import com.example.huytrinh.news.data.DataManager;
import com.example.huytrinh.news.data.model.MyResponse;

/**
 * Created by HUYTRINH on 2/11/2018.
 */

public class NewsListPresenter implements NewsListContract.Presenter {

    private NewsListContract.View view;
    private DataManager dataManager;

    public NewsListPresenter(DataManager dataManager) {
        this.dataManager = dataManager;
    }

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
        dataManager.getNews(new ApiCallback() {
            @Override
            public void onRequestSuccess(MyResponse response) {
                view.onLoadNewsListSuccess(response);
            }

            @Override
            public void onRequestFailure(String errorResponse) {
                view.onLoadNewsListFailure(errorResponse);
            }
        });

//        dataManager.getMockData(new ApiCallback() {
//            @Override
//            public void onRequestSuccess(MyResponse response) {
//                view.onLoadNewsListSuccess(response);
//            }
//
//            @Override
//            public void onRequestFailure(String errorResponse) {
//                view.onLoadNewsListFailure(errorResponse);
//            }
//        });
    }
}
