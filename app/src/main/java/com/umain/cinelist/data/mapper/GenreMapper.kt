package com.umain.cinelist.data.mapper

import com.umain.cinelist.data.remote.dto.GenreDto
import com.umain.cinelist.domain.model.Genre

fun GenreDto.toDomain(): Genre {
    return Genre(
        id = id,
        name = name
    )
}