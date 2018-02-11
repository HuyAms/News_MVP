package com.example.huytrinh.news.data;

import com.example.huytrinh.news.data.model.MyResponse;

/**
 * Created by HUYTRINH on 2/11/2018.
 */

public interface ApiCallback {

    void onRequestSuccess(MyResponse response);

    void onRequestFailure(String errorResponse);
}
