package com.rahul.dailypulus.di

import com.rahul.dailypulus.articles.di.articlesModule

val sharedKoinModules = listOf(
    articlesModule,
    networkModule
)