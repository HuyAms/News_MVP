package com.example.huytrinh.news.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by HUYTRINH on 2/10/2018.
 */

public class AppSharedPreferences implements AppSharedPreferencesManager {

    private SharedPreferences sharedPreferences;

    public AppSharedPreferences(Context context) {
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
    }

    @Override
    public boolean isLoggedIn() {
        return false;
    }

    @Override
    public String getServerToken() {
        return null;
    }

    @Override
    public String saveServerToken() {
        return null;
    }

    @Override
    public void clear() {

    }
}
