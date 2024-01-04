package com.example.wiprocodetestapplication.presentation.viewmodel

import com.example.wiprocodetestapplication.domain.model.Movie
import java.util.Collections.emptyList

data class MovieUiState(
    val moviesList: List<Movie> = emptyList(),
    val isLoading: Boolean = false
)