package com.example.newsapp;

import android.content.Context;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RequestManager {
    Context context;
    Retrofit retrofit= new Retrofit.Builder().baseUrl("https://newapi.org/v2/")
            .addConverterFactory(GsonConverterFactory.create()).build();
}
