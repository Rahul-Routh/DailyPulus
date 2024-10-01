package com.rahul.dailypulus.articles

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get

class ArticlesService(private val httpClient: HttpClient) {
    private val country = "us"
    private val category = "business"
    private val apiKey = "5d829b45864c48918f64f9275e465a0d"

    suspend fun fetchArticles():List<ArticlesDetails>{
        val response: ArticlesResponse = httpClient.get(
            "https://newsapi.org/v2/top-headlines?country=$country&category=$category&apiKey=$apiKey").body()
        return response.articles

    }
}