package com.example.wiprocodetestapplication.domain.repository

import com.example.wiprocodetestapplication.data.source.remote.Resource
import com.example.wiprocodetestapplication.domain.model.Movie
import kotlinx.coroutines.flow.Flow

interface MovieRepository {
    fun getPopularMovies(): Flow<Resource<List<Movie>>>
}