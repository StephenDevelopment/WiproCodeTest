package com.example.wiprocodetestapplication.di.movies

import com.example.wiprocodetestapplication.data.repository.MovieRepositoryImpl
import com.example.wiprocodetestapplication.data.source.local.roomdb.dao.MovieDao
import com.example.wiprocodetestapplication.data.source.local.roomdb.dao.PopularMoviesDao
import com.example.wiprocodetestapplication.data.source.remote.MovieApiService
import com.example.wiprocodetestapplication.domain.repository.MovieRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class MoviesRepositoryModule {

    @Provides
    @Singleton
    fun provideMovieRepositoryImpl(
        movieApiService: MovieApiService,
        popularMoviesDao: PopularMoviesDao,
        movieDao: MovieDao
    ): MovieRepository = MovieRepositoryImpl(movieApiService, popularMoviesDao, movieDao)

}