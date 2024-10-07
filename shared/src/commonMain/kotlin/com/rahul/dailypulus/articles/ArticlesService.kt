package com.rahul.dailypulus.articles

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get

class ArticlesService(private val httpClient: HttpClient) {
    private val userId = "693"
    private val category = "business"
    private val apiKey = "5d829b45864c48918f64f9275e465a0d"

    suspend fun fetchArticles():List<ResultDetails>{
        val response: ArticlesResponse = httpClient.get(
            "https://dev-test-erp.co.in/basic/api_tracker/project/emp_list_mstr_api.php?user_id=$userId").body()
        return response.resultset

    }
}