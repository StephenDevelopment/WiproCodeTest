package com.example.wiprocodetestapplication.data.source.local.roomdb.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.wiprocodetestapplication.data.source.local.roomdb.entity.MovieEntity
import com.example.wiprocodetestapplication.data.source.local.roomdb.entity.PopularMoviesEntity

@Dao
interface PopularMoviesDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertPopularMovies(movies: List<PopularMoviesEntity>)

    @Query("SELECT * FROM ${PopularMoviesEntity.TABLE_NAME}")
    suspend fun getPopularMoviesList(): List<PopularMoviesEntity>

    @Query("DELETE FROM ${PopularMoviesEntity.TABLE_NAME}")
    suspend fun deleteAll()
}