package com.example.wiprocodetestapplication.di.movies

import com.example.wiprocodetestapplication.domain.repository.MovieRepository
import com.example.wiprocodetestapplication.domain.usecase.GetPopularMovies
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class MoviesUsecaseModule {

    @Provides
    @Singleton
    fun provideGetPopularMoviesUseCase(repository: MovieRepository): GetPopularMovies =
        GetPopularMovies(repository)
}