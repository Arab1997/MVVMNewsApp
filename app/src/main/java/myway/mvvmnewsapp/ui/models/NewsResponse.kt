package myway.mvvmnewsapp.ui.models

import myway.mvvmnewsapp.ui.models.Article

data class NewsResponse (
    val articles: MutableList<Article>,
    val status: String,
    val totalResults: Int
)