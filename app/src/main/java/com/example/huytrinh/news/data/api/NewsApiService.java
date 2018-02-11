package com.example.huytrinh.news.data.api;

import com.example.huytrinh.news.data.model.MyResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

/**
 * Created by HUYTRINH on 2/11/2018.
 */

public interface NewsApiService {

//    @GET("")
//    Observable<> getNews {
//
//    };
//
    @GET("topstories/v2/home.json")
    Call<MyResponse> getNews(@Header("api-key") String apiKey);
}
