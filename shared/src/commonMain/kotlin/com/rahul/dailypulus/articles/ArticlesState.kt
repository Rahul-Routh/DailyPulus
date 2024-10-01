package com.rahul.dailypulus.articles

class ArticlesState(
    val articles: List<Article> = listOf(),
    val isLoading: Boolean = false,
    val error: String? = null
)
