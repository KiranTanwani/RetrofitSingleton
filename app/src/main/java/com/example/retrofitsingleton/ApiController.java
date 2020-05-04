package com.example.retrofitsingleton;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiController {

    private static Retrofit retrofit = null;
    private static String BASE_URL = "https://jsonplaceholder.typicode.com/";

    public static GetDataFromApi getService() {


        if (retrofit == null) {

            retrofit = new Retrofit
                    .Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }


        return retrofit.create(GetDataFromApi.class);
    }
}
