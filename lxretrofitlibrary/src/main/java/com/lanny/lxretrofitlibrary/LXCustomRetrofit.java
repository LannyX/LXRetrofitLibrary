package com.lanny.lxretrofitlibrary;

import android.content.Context;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class LXCustomRetrofit {

    public static void BuildLXRetrofit(Context c, String url){
        new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
}
