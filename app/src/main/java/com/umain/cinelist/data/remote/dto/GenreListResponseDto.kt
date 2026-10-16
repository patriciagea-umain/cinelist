package com.umain.cinelist.data.remote.dto

import kotlinx.serialization.Serializable

@Serializable
data class GenreListResponseDto(
    val genres: List<GenreDto>
)