package com.afdhal_fa.simplecleanarchitecture.data.sevice

import com.afdhal_fa.simplecleanarchitecture.BuildConfig
import com.afdhal_fa.simplecleanarchitecture.data.response.NowPlayingDto
import com.afdhal_fa.simplecleanarchitecture.data.response.TvOnTheAirDto
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by Muh Fuad Afdhal on 9/24/2021
 * Email: fuad.afdal.fa@gmail.com
 */

interface MovieService {
    @GET("movie/now_playing")
    suspend fun getMovieNowPlaying(@Query("api_key") apiKey: String = BuildConfig.API_KEY): NowPlayingDto

    @GET("tv/on_the_air")
    suspend fun getTvOnTheAir(@Query("api_key") apiKey: String = BuildConfig.API_KEY): TvOnTheAirDto
}