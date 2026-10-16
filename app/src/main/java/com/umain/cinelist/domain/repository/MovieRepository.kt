package com.umain.cinelist.domain.repository

import com.umain.cinelist.domain.model.Genre
import com.umain.cinelist.domain.model.Movie

interface MovieRepository {
    suspend fun getPopularMovies(page: Int): List<Movie>
    suspend fun searchMovies(query: String, page: Int): List<Movie>
    suspend fun getGenres(): List<Genre>
    suspend fun getMoviesByGenre(genreId: Int, page: Int): List<Movie>
    suspend fun getMovieDetails(movieId: Int): Movie
}