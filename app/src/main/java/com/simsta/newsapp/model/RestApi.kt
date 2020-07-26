package com.simsta.newsapp.model

import com.simsta.newsapp.data.NewsListData
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface RestApi {

    @Headers("Content-Type: application/json")
    @POST("users")
    fun getNewsList(@Body newsListData: NewsListData): Call<NewsListData>
}