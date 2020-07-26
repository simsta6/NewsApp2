package com.simsta.newsapp.data

import com.google.gson.annotations.SerializedName

data class SourceData(
    @SerializedName("id")
    val id: Int?,
    @SerializedName("name")
    val name: String?)
{
}