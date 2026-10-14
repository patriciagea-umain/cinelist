package com.umain.cinelist.domain.repository

import com.umain.cinelist.domain.model.Movie
import com.umain.cinelist.domain.model.Genre

interface MovieRepository {
    suspend fun getPopularMovies(page: Int): List<Movie>
    suspend fun searchMovies(query: String, page: Int): List<Movie>
    suspend fun getGenres(): List<Genre>
    suspend fun getMovieGenres(movieId: Int): Movie
    suspend fun getMoviesByGenre(genreId: Int, page: Int): List<Movie>
}