package com.queen.rxjavaretrofitdemo.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.queen.rxjavaretrofitdemo.R;
import com.queen.rxjavaretrofitdemo.entity.NewsModel;
import com.queen.rxjavaretrofitdemo.subscribers.ProgressSubscriber;
import com.queen.rxjavaretrofitdemo.subscribers.SubscriberOnNextListener;
import com.queen.rxjavaretrofitdemo.entity.Subject;
import com.queen.rxjavaretrofitdemo.http.HttpMethods;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.click_me_BN)
    Button clickMeBN;
    @Bind(R.id.result_TV)
    TextView resultTV;

    private SubscriberOnNextListener getTopMovieOnNext;
    private SubscriberOnNextListener getNewsOnNext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

//        getTopMovieOnNext = new SubscriberOnNextListener<List<Subject>>() {
//            @Override
//            public void onNext(List<Subject> subjects) {
//                if (subjects !=null)
//                {
//                    resultTV.setText(String.valueOf(subjects)/*.get(0).getTitle()*/);
//
//                }
//            }
//        };

        getNewsOnNext = new SubscriberOnNextListener<List<NewsModel>>() {
            @Override
            public void onNext(List<NewsModel> subjects) {
                if (subjects !=null)
                {
                    resultTV.setText(subjects.get(0).getTitle());

                }
            }
        };


    }

    @Override
    protected void onStart() {
        super.onStart();


    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @OnClick(R.id.click_me_BN)
    public void onClick() {
        getMovie();
    }


    //进行网络请求
    private void getMovie() {
//        HttpMethods.getInstance().getTopMovie(new ProgressSubscriber(getTopMovieOnNext, MainActivity.this), 0, 10);

        HttpMethods.getInstance().getNews(new ProgressSubscriber<List<NewsModel>>(getNewsOnNext, MainActivity.this));
    }
}
