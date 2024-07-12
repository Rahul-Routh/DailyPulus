package com.rahul.dailypulus.articles

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ArticlesResponse (
    @SerialName("status") val status : String,
    @SerialName("totalResults") val totalResults : Int,
    @SerialName("articles") val articles : List<ArticlesDetails>
)

@Serializable
data class ArticlesDetails(
    @SerialName("title") val title : String,
    @SerialName("description") val desc : String?,
    @SerialName("publishedAt") val date : String,
    @SerialName("urlToImage") val imageUrl : String?,
)
