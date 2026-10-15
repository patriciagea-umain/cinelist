package com.umain.cinelist.ui.home

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.umain.cinelist.domain.model.Movie
import com.umain.cinelist.domain.usecase.GetPopularMoviesUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class HomeViewModel(
    private val getPopularMovies: GetPopularMoviesUseCase
) : ViewModel() {

    private val _movies = MutableStateFlow<List<Movie>>(emptyList())
    val movies: StateFlow<List<Movie>> = _movies

    init {
        viewModelScope.launch {
            try {
                _movies.value = getPopularMovies()
            } catch (e: Exception) {
                Log.e("HomeViewModel", "Error loading movies: ${e.message}")
            }
        }
    }}