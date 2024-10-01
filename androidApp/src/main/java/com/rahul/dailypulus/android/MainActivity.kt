package com.rahul.dailypulus.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.rahul.dailypulus.Platform
import com.rahul.dailypulus.android.screen.AboutScreen
import com.rahul.dailypulus.android.screen.ArticlesScreen
import com.rahul.dailypulus.articles.ArticlesViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Platform().logSystemInfo()
        val articlesViewModel : ArticlesViewModel by viewModels()

        setContent {
            MyApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //AboutScreen()
                    //ArticlesScreen(articlesViewModel = articlesViewModel)
                    AppScaffold(articlesViewModel = articlesViewModel)
                }
            }
        }
    }
}
