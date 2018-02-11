package com.example.huytrinh.news.data.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * Created by HUYTRINH on 2/11/2018.
 */

public class News implements Parcelable {
    @SerializedName("title")
    private String title;

    @SerializedName("abstract")
    private String shortContent;

    @SerializedName("url")
    private String url;

    public News(String title, String shortContent, String url) {
        this.title = title;
        this.shortContent = shortContent;
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getShortContent() {
        return shortContent;
    }

    public void setShortContent(String shortContent) {
        this.shortContent = shortContent;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.title);
        dest.writeString(this.shortContent);
        dest.writeString(this.url);
    }

    protected News(Parcel in) {
        this.title = in.readString();
        this.shortContent = in.readString();
        this.url = in.readString();
    }

    public static final Parcelable.Creator<News> CREATOR = new Parcelable.Creator<News>() {
        @Override
        public News createFromParcel(Parcel source) {
            return new News(source);
        }

        @Override
        public News[] newArray(int size) {
            return new News[size];
        }
    };

    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' +
                ", shortContent='" + shortContent + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
