package com.umain.cinelist.domain.usecase

import com.umain.cinelist.domain.model.Movie
import com.umain.cinelist.domain.repository.MovieRepository

class GetMoviesByGenreUseCase(
    private val repository: MovieRepository
) {
    suspend operator fun invoke(genreId: Int, page: Int = 1): List<Movie> {
        return repository.getMoviesByGenre(genreId, page)
    }
}