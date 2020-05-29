package myway.mvvmnewsapp.ui.ui

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import myway.mvvmnewsapp.ui.repository.NewsRepository

class NewsVIewModelProviderFactory(
    val app: Application,
    val newsRepository: NewsRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return NewsViewModel(app, newsRepository) as T
    }
}