package com.example.huytrinh.news.ui.mainscreen.newslist;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.huytrinh.news.R;
import com.example.huytrinh.news.data.model.News;
import com.example.huytrinh.news.ui.mainscreen.MainActivity;

import java.util.List;

/**
 * Created by HUYTRINH on 2/11/2018.
 */

public class NewsListAdapter extends RecyclerView.Adapter<NewsListAdapter.ViewHolder> {
    private List<News> newsList;
    private Context context;
    private NewsListAdapterCallBack newsListAdapterCallBack;

    public interface NewsListAdapterCallBack {

        void startNewsDatail(String url);
    }


    public NewsListAdapter(List<News> newsList, Context context) {
        this.newsList = newsList;
        this.context = context;
        this.newsListAdapterCallBack = (MainActivity)context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.news_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        News news = newsList.get(position);
        holder.title.setText(news.getTitle());
        holder.content.setText(news.getShortContent());
        holder.setItem(news);
    }

    @Override
    public int getItemCount() {
        return newsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView title;
        private TextView content;
        private News news;

        public ViewHolder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            content = itemView.findViewById(R.id.content);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    newsListAdapterCallBack.startNewsDatail(news.getUrl());
                }
            });
        }

        public void setItem(News news) {
            this.news = news;
        }
    }
}
