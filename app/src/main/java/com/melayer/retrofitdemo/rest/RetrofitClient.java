package com.melayer.retrofitdemo.rest;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by  on 18/11/17.
 */

public class RetrofitClient {
    private static Retrofit retrofit;
    //public static final String BASE_URL = "fmngjk";

    public RetrofitClient() {
    }

    public static Retrofit getClient() {
        retrofit = new Retrofit.Builder()
                .baseUrl(ApiUtils.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit;
    }


}
