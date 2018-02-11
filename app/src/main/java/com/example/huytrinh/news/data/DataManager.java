package com.example.huytrinh.news.data;

import com.example.huytrinh.news.data.api.NewsApiService;
import com.example.huytrinh.news.data.model.MyResponse;
import com.example.huytrinh.news.data.model.News;
import com.example.huytrinh.news.util.Constants;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by HUYTRINH on 2/11/2018.
 */

public class DataManager {

    public DataManager() {

    }
    private NewsApiService newsApiService;

    public DataManager(NewsApiService newsApiService) {
        this.newsApiService = newsApiService;
    }

    public void getNews(final ApiCallback apiCallback) {
        Call<MyResponse> call = newsApiService.getNews(Constants.API_KEY);
        call.enqueue(new Callback<MyResponse>() {
            @Override
            public void onResponse(Call<MyResponse> call, Response<MyResponse> response) {
                if(response.isSuccessful()) {
                    MyResponse myResponse = response.body();
                    apiCallback.onRequestSuccess(myResponse);
                } else {
                    apiCallback.onRequestFailure("Fail to request");
                }
            }

            @Override
            public void onFailure(Call<MyResponse> call, Throwable t) {
                apiCallback.onRequestFailure(t.getMessage());
            }
        });
    }

    public void getMockData(final ApiCallback apiCallback) {
        List<News> news = new ArrayList<>();
        news.add(new News("title1", "constent", "url"));
        news.add(new News("title2", "constent", "url"));
        news.add(new News("title3", "constent", "url"));
        MyResponse myResponse = new MyResponse("Ok", news);

        if (true) {
            apiCallback.onRequestSuccess(myResponse);
        } else {
            apiCallback.onRequestFailure("failed");
        }
    }
}
