package com.example.huytrinh.news.common;

/**
 * Created by HUYTRINH on 2/10/2018.
 */

public interface AppSharedPreferencesManager {

    boolean isLoggedIn();

    String getServerToken();

    String saveServerToken();

    void clear();
}
