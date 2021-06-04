package com.example.retrofit;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface RetrofitService {

//    @FormUrlEncoded
//    @POST("/cosmeticsListName")
//    Call<ArrayList<RecyclerCategoryNoImageItem>> getBoardArray(@Field("index") int index);

    @FormUrlEncoded
    @POST("/cosmeticsListName")
    Call<ArrayList<Item>> arrayList(@Field("index") int index);

    @FormUrlEncoded
    @POST("/cosmeticsListName")
    Call<Void> get(@Field("index") int index);

    @FormUrlEncoded
    @POST("/cosmeticsListLook")
    Call<String> getJsonString(@Field("index") int index);

    @GET("/TEST")
    Call<String> stringTest();

}
