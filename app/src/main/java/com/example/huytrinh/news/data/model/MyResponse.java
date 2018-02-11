package com.example.huytrinh.news.data.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HUYTRINH on 2/11/2018.
 */

public class MyResponse implements Parcelable {
    @SerializedName("status")
    private String status;

    @SerializedName("results")
    private List<News> results;

    public MyResponse(String status, List<News> results) {
        this.status = status;
        this.results = results;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<News> getResults() {
        return results;
    }

    public void setResults(List<News> results) {
        this.results = results;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.status);
        dest.writeList(this.results);
    }

    protected MyResponse(Parcel in) {
        this.status = in.readString();
        this.results = new ArrayList<News>();
        in.readList(this.results, News.class.getClassLoader());
    }

    public static final Parcelable.Creator<MyResponse> CREATOR = new Parcelable.Creator<MyResponse>() {
        @Override
        public MyResponse createFromParcel(Parcel source) {
            return new MyResponse(source);
        }

        @Override
        public MyResponse[] newArray(int size) {
            return new MyResponse[size];
        }
    };

    @Override
    public String toString() {
        return "MyResponse{" +
                "status='" + status + '\'' +
                ", results=" + results +
                '}';
    }
}
