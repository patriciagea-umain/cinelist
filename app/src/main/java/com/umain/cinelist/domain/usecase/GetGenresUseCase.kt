package com.umain.cinelist.domain.usecase

import com.umain.cinelist.domain.model.Genre
import com.umain.cinelist.domain.repository.MovieRepository

class GetGenresUseCase(
    private val repository: MovieRepository
) {
    suspend operator fun invoke(): List<Genre> {
        return repository.getGenres()
    }
}