package com.umain.cinelist.data.mapper

import com.umain.cinelist.data.remote.dto.MovieDto
import org.junit.Assert.assertEquals
import org.junit.Test

class MovieMapperTest {

    @Test
    fun `toDomain maps title correctly`() {
        // Given
        val dto = MovieDto(
            id = 3,
        title = "Patricia",
        overview = "xyx",
        voteAverage = 5.3
        )

        // When
        val movie = dto.toDomain()

        // Then
        assertEquals("Patricia", movie.title)
    }
}