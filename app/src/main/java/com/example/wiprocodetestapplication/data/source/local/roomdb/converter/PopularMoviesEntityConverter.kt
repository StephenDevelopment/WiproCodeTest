package com.example.wiprocodetestapplication.data.source.local.roomdb.converter

import androidx.room.TypeConverter
import com.example.wiprocodetestapplication.data.source.local.roomdb.entity.MovieEntity
import com.example.wiprocodetestapplication.domain.model.Movie
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory

class PopularMoviesEntityConverter {

    @TypeConverter
    fun fromStringToMovieList(value: String): List<Movie>? =
        Moshi.Builder()
            .add(KotlinJsonAdapterFactory())
            .build()
            .adapter<List<Movie>>(Types.newParameterizedType(List::class.java, Movie::class.java))
            .fromJson(value)

    @TypeConverter
    fun fromMovieListTypeToString(movieListType: List<Movie>?): String =
        Moshi.Builder()
            .add(KotlinJsonAdapterFactory())
            .build()
            .adapter<List<Movie>>(Types.newParameterizedType(List::class.java, Movie::class.java))
            .toJson(movieListType)


    @TypeConverter
    fun fromStringToMovieEntityList(value: String): List<MovieEntity>? =
        Moshi.Builder()
            .add(KotlinJsonAdapterFactory())
            .build().adapter<List<MovieEntity>>(
                Types.newParameterizedType(
                    List::class.java,
                    MovieEntity::class.java
                )
            ).fromJson(value)

    @TypeConverter
    fun fromMovieEntityListTypeToString(movieEntityListType: List<MovieEntity>?): String =
        Moshi.Builder()
            .add(KotlinJsonAdapterFactory())
            .build().adapter<List<MovieEntity>>(
                Types.newParameterizedType(
                    List::class.java,
                    MovieEntity::class.java
                )
            ).toJson(movieEntityListType)

}