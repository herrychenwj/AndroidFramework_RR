package com.queen.rxjavaretrofitdemo.http;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.internal.bind.DateTypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.queen.rxjavaretrofitdemo.entity.HttpResult;
import com.queen.rxjavaretrofitdemo.entity.NewsModel;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Converter;

/**
 * Created by Charles on 2016/3/17.
 */
class GsonResponseBodyConverter<T> implements Converter<ResponseBody, T> {
    private final Gson gson;
    private final Type type;

    GsonResponseBodyConverter(Gson gson, Type type) {
        this.gson = gson;
        this.type = type;
    }

    @Override
    public T convert(ResponseBody value) throws IOException {
        String response = value.string();
        Log.d("Network", "response>>" + response);
        //httpResult 只解析result字段
//            HttpResult httpResult = gson.fromJson(response, HttpResult.class);
//            // TODO
//            if (httpResult.getError_message() != null) {
//                ApiException.errorMsg = httpResult.getError_message();
//                throw new ApiException(102);
//            }

        return gson.fromJson(response,   type);
//        return (T) response;


    }
}
