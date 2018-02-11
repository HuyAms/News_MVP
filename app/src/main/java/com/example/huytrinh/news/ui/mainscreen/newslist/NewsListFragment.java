package com.example.huytrinh.news.ui.mainscreen.newslist;

import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.huytrinh.news.R;
import com.example.huytrinh.news.data.model.MyResponse;
import com.example.huytrinh.news.data.model.News;
import com.example.huytrinh.news.ui.base.BaseFragment;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class NewsListFragment extends BaseFragment implements NewsListContract.View {

    @BindView(R.id.recyclerView)
    RecyclerView recyclerListView;

    @Inject
    NewsListContract.Presenter presenter;

    private NewsListAdapter newsListAdapter;

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
        ButterKnife.bind(this, v);

        setUpRecyclerView();



        //Load news
        presenter.attachView(this);
        presenter.loadNewsList();

        return v;
    }

    private void setUpRecyclerView() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerListView.setLayoutManager(linearLayoutManager);
        DividerItemDecoration mDividerItemDecoration = new DividerItemDecoration(
                recyclerListView.getContext(),
                linearLayoutManager.getOrientation()
        );
        recyclerListView.addItemDecoration(mDividerItemDecoration);
    }

    @Override
    public void onShowLoading() {

    }

    @Override
    public void onHideLoading() {

    }

    @Override
    public void onLoadNewsListSuccess(MyResponse myResponse) {
        List<News> newsList = myResponse.getResults();
        newsListAdapter = new NewsListAdapter(newsList, getActivity());
        recyclerListView.setAdapter(newsListAdapter);
        Log.d("abc", "onLoadNewsListSuccess: " + myResponse.getResults());
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
