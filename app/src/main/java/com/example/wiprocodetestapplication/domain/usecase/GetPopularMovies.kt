package com.example.wiprocodetestapplication.domain.usecase

import com.example.wiprocodetestapplication.data.source.remote.Resource
import com.example.wiprocodetestapplication.domain.model.Movie
import com.example.wiprocodetestapplication.domain.repository.MovieRepository
import kotlinx.coroutines.flow.Flow

class GetPopularMovies(
    private val movieRepository: MovieRepository
) {
    operator fun invoke(): Flow<Resource<List<Movie>>> {
        return movieRepository.getPopularMovies()
    }
}