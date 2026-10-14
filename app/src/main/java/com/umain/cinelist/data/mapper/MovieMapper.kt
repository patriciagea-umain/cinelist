package com.umain.cinelist.data.mapper

import com.umain.cinelist.data.remote.dto.MovieDetailDto
import com.umain.cinelist.data.remote.dto.MovieDto
import com.umain.cinelist.domain.model.Movie

fun MovieDto.toDomain(): Movie {
    return Movie(
        id = id,
        title = title,
        posterPath = posterPath,
        voteAverage = voteAverage,
        overview = overview,
        backdropPath = backdropPath,
        releaseDate = releaseDate,
        genreIds = genreIds
    )
}

fun MovieDetailDto.toDomain(): Movie {
    return Movie(
        id = id,
        title = title,
        posterPath = posterPath,
        voteAverage = voteAverage,
        overview = overview,
        backdropPath = backdropPath,
        releaseDate = releaseDate,
        genreIds = genres.map { it.id }
    )
}