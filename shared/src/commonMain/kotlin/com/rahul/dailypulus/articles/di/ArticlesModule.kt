package com.rahul.dailypulus.articles.di

import com.rahul.dailypulus.articles.ArticlesService
import com.rahul.dailypulus.articles.ArticlesUseCase
import com.rahul.dailypulus.articles.ArticlesViewModel
import org.koin.dsl.module

val articlesModule = module {
    single<ArticlesService>{ ArticlesService(get()) }
    single<ArticlesUseCase>{ ArticlesUseCase(get()) }
    single<ArticlesViewModel>{ ArticlesViewModel(get()) }
}