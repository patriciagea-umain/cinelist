package com.umain.cinelist.fake

import com.umain.cinelist.domain.model.Genre
import com.umain.cinelist.domain.model.Movie
import com.umain.cinelist.domain.repository.MovieRepository

class FakeMovieRepository : MovieRepository {
    override suspend fun getPopularMovies(page: Int): List<Movie> {
        return listOf(
            Movie(
                id = 1,
                title = "Patricia",
                overview = "xyx",
                posterPath = null,
                backdropPath = null,
                releaseDate = null,
                voteAverage = 5.3
            )
        )
    }

    override suspend fun searchMovies(
        query: String,
        page: Int
    ): List<Movie> {
        TODO("Not yet implemented")
    }

    override suspend fun getGenres(): List<Genre> {
        TODO("Not yet implemented")
    }

    override suspend fun getMoviesByGenre(
        genreId: Int,
        page: Int
    ): List<Movie> {
        TODO("Not yet implemented")
    }

    override suspend fun getMovieDetails(movieId: Int): Movie {
        TODO("Not yet implemented")
    }
}