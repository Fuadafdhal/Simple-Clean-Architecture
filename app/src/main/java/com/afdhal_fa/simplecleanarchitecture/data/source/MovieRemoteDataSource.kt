package com.afdhal_fa.simplecleanarchitecture.data.source

import com.afdhal_fa.simplecleanarchitecture.data.response.NowPlayingDto
import com.afdhal_fa.simplecleanarchitecture.data.response.TvOnTheAirDto
import com.afdhal_fa.simplecleanarchitecture.data.sevice.MovieService
import com.afdhal_fa.simplecleanarchitecture.data.vo.Result
import kotlinx.coroutines.CoroutineDispatcher
import javax.inject.Inject

/**
 * Created by Muh Fuad Afdhal on 9/24/2021
 * Email: fuad.afdal.fa@gmail.com
 */

class MovieRemoteDataSource @Inject constructor(
    private val movieService: MovieService
) : RemoteDataSource() {
    suspend fun getMovieNowPlaying(dispatcherProvider: CoroutineDispatcher): Result<NowPlayingDto> {
        return safeApiCall(dispatcherProvider) { movieService.getMovieNowPlaying() }
    }

    suspend fun getTvOnTheAir(dispatcherProvider: CoroutineDispatcher): Result<TvOnTheAirDto> {
        return safeApiCall(dispatcherProvider) { movieService.getTvOnTheAir() }
    }
}