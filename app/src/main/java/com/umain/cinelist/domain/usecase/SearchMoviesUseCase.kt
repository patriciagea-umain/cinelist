package com.umain.cinelist.domain.usecase

import com.umain.cinelist.domain.model.Movie
import com.umain.cinelist.domain.repository.MovieRepository

class SearchMoviesUseCase(
    private val repository: MovieRepository
) {
    suspend operator fun invoke(query: String, page: Int = 1): List<Movie> {
        return repository.searchMovies(query, page)
    }
}
