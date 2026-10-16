package com.umain.cinelist.data.repository

import com.umain.cinelist.data.mapper.toDomain
import com.umain.cinelist.data.remote.TmdbApiService
import com.umain.cinelist.domain.model.Genre
import com.umain.cinelist.domain.model.Movie
import com.umain.cinelist.domain.repository.MovieRepository

class MovieRepositoryImpl(
    private val api: TmdbApiService
) : MovieRepository {

    override suspend fun getPopularMovies(page: Int): List<Movie> {
        return api.getPopularMovies(page).results.map { it.toDomain() }
    }

    override suspend fun searchMovies(query: String, page: Int): List<Movie> {
        return api.searchMovies(query, page).results.map { it.toDomain() }
    }

    override suspend fun getGenres(): List<Genre> {
        return api.getGenres().genres.map { it.toDomain() }
    }

    override suspend fun getMoviesByGenre(genreId: Int, page: Int): List<Movie> {
        return api.getMoviesByGenre(genreId, page).results.map { it.toDomain() }
    }

    override suspend fun getMovieDetails(movieId: Int): Movie {
        return api.getMovieDetails(movieId).toDomain()
    }
}