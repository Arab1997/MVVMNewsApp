package myway.mvvmnewsapp.ui.repository

import myway.mvvmnewsapp.ui.api.RetrofitInstance
import myway.mvvmnewsapp.ui.db.ArticleDatabase
import myway.mvvmnewsapp.ui.models.Article
import retrofit2.Retrofit

class NewsRepository(
    val db: ArticleDatabase
) {
    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode, pageNumber)

    suspend fun searchNews(searchQuery: String, pageNumber: Int)=
        RetrofitInstance.api.searchNews(searchQuery, pageNumber)

    suspend fun  upsert(article: Article) =  db.getArticleDao().upsert(article)

    fun getSavedNews() = db.getArticleDao().getAllArticles()

    suspend fun deleteArticle(article: Article) = db.getArticleDao().deleteArticle(article)
}