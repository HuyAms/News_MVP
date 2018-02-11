package com.example.huytrinh.news.ui.mainscreen.newslist;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.huytrinh.news.R;
import com.example.huytrinh.news.data.model.MyResponse;
import com.example.huytrinh.news.ui.base.BaseFragment;

import javax.inject.Inject;

public class NewsListFragment extends BaseFragment implements NewsListContract.View {

    @Inject
    NewsListContract.Presenter presenter;

    public NewsListFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_news_list, container, false);


        //Load news
        presenter.attachView(this);
        presenter.loadNewsList();

        return v;
    }

    @Override
    public void onShowLoading() {

    }

    @Override
    public void onHideLoading() {

    }

    @Override
    public void onLoadNewsListSuccess(MyResponse myResponse) {
        Log.d("abc", "onLoadNewsListSuccess: " + myResponse);
    }

    @Override
    public void onLoadNewsListFailure(String error) {
        Log.d("abc", "onLoadNewsListFailure: " + error);
    }

    @Override
    public void onDetach() {
        super.onDetach();
        presenter.detachView();
    }
}
