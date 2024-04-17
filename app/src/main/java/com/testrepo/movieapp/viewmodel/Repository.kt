package com.testrepo.movieapp.viewmodel

import com.testrepo.movieapp.models.MoviesList
import com.testrepo.movieapp.utils.RetrofitInstance
import retrofit2.Response

class Repository {
    suspend fun getMoviesList(page: Int): Response<MoviesList>{
        return RetrofitInstance.api.getMovies(page)
    }
}