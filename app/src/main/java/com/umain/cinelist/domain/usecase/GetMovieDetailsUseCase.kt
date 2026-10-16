package com.umain.cinelist.domain.usecase

import com.umain.cinelist.domain.model.Movie
import com.umain.cinelist.domain.repository.MovieRepository

class GetMovieDetailsUseCase (
    private val repository: MovieRepository
) {
    suspend operator fun invoke(movieId: Int): Movie {
        return repository.getMovieDetails(movieId)
    }
}
