package com.simsta.newsapp.data

import com.google.gson.annotations.SerializedName

data class NewsListData(
    @SerializedName("status")
    val status: String?,
    @SerializedName("totalResults")
    val totalResults: Int?,
    @SerializedName("articles")
    val articles: NewsDetailsData?)
{
}