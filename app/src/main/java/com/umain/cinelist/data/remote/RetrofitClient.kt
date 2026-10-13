package com.umain.cinelist.data.remote

import com.umain.cinelist.BuildConfig
import kotlinx.serialization.json.Json
import okhttp3.Interceptor
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.kotlinx.serialization.asConverterFactory

object RetrofitClient {

    private const val BASE_URL = "https://api.themoviedb.org/3/"

    private val json = Json { ignoreUnknownKeys = true }

    private val apiKeyInterceptor = Interceptor { chain ->
        val originalRequest = chain.request()
        val newUrl = originalRequest.url.newBuilder()
            .addQueryParameter("api_key", BuildConfig.TMDB_API_KEY)
            .build()
        chain.proceed(originalRequest.newBuilder().url(newUrl).build())
    }

    private val loggingInterceptor = HttpLoggingInterceptor().apply {
        level = HttpLoggingInterceptor.Level.BODY
    }

    private val okHttpClient = OkHttpClient.Builder()
        .addInterceptor(apiKeyInterceptor)
        .addInterceptor(loggingInterceptor)
        .build()

    val api: TmdbApi = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .client(okHttpClient)
        .addConverterFactory(json.asConverterFactory("application/json".toMediaType()))
        .build()
        .create(TmdbApi::class.java)
}