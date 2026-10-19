package com.umain.cinelist.domain.usecase


import com.umain.cinelist.fake.FakeMovieRepository
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Test

class GetPopularMoviesUseCaseTest {

    @Test
    fun `invoke returns movies from repository`() = runTest {
        // Given
        val repository = FakeMovieRepository()
        val useCase = GetPopularMoviesUseCase(repository)

        // When
        val movies = useCase()

        // Then
        assertEquals(1, movies.size)
        assertEquals("Patricia", movies.first().title)
    }
}