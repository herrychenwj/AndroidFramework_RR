package com.queen.rxjavaretrofitdemo.http;

import com.google.gson.JsonObject;
import com.queen.rxjavaretrofitdemo.entity.HttpResult;
import com.queen.rxjavaretrofitdemo.entity.NewsModel;
import com.queen.rxjavaretrofitdemo.entity.PostParam;
import com.queen.rxjavaretrofitdemo.entity.Subject;

import java.util.List;

import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by liukun on 16/3/9.
 */
public interface MovieService {

//    @GET("top250")
//    Call<MovieEntity> getTopMovie(@Query("start") int start, @Query("count") int count);

//    @GET("top250")
//    Observable<MovieEntity> getTopMovie(@Query("start") int start, @Query("count") int count);

//    @GET("top250")
//    Observable<HttpResult<List<Subject>>> getTopMovie(@Query("start") int start, @Query("count") int count);

    @GET("top250")
    Observable<HttpResult<List<Subject>>> getTopMovie(@Query("start") int start, @Query("count") int count);

//    @FormUrlEncoded
    @POST("api/museum/news")
    Observable<List<NewsModel>> getNews(@Body PostParam paras);

//    @FormUrlEncoded
//    @POST("api/museum/news")
//    Observable<HttpResult<List<NewsModel>>> getNews(@Field("device_id")String d);
}
