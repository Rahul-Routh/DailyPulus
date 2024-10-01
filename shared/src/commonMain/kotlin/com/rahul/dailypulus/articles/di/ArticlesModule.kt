package com.rahul.dailypulus.articles.di

import com.rahul.dailypulus.articles.ArticlesService
import com.rahul.dailypulus.articles.ArticlesUsedCase
import com.rahul.dailypulus.articles.ArticlesViewModel
import org.koin.dsl.module

val articlesModule = module {
    single<ArticlesService>{ArticlesService(get())}
    single<ArticlesUsedCase>{ ArticlesUsedCase(get()) }
    single<ArticlesViewModel>{ArticlesViewModel()}
}