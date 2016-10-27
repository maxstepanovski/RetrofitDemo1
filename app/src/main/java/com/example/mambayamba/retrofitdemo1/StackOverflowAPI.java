package com.example.mambayamba.retrofitdemo1;

import com.example.mambayamba.retrofitdemo1.model.Item;

import java.util.List;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by mambayamba on 27.10.2016.
 */
public interface StackOverflowAPI {
    @GET("/2.2/search?order=desc&sort=activity&site=stackoverflow")
    Call<SOItems> loadItems(@Query("tagged")String tag);
}
