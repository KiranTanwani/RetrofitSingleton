package com.example.retrofitsingleton;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetDataFromApi {

    @GET("posts")
    Call<List<Post>> getPosts();
}
