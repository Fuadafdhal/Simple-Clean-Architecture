package com.afdhal_fa.simplecleanarchitecture.data.repository

import com.afdhal_fa.simplecleanarchitecture.data.dispatcher.DispatcherProvider
import com.afdhal_fa.simplecleanarchitecture.data.mapper.MovieMapper
import com.afdhal_fa.simplecleanarchitecture.data.mapper.TvOnTheAirMapper
import com.afdhal_fa.simplecleanarchitecture.data.source.MovieRemoteDataSource
import com.afdhal_fa.simplecleanarchitecture.data.vo.Result
import com.afdhal_fa.simplecleanarchitecture.domain.entity.NowPlaying
import com.afdhal_fa.simplecleanarchitecture.domain.entity.TvOnTheAir
import com.afdhal_fa.simplecleanarchitecture.domain.repository.MovieRepository
import javax.inject.Inject

/**
 * Created by Muh Fuad Afdhal on 9/24/2021
 * Email: fuad.afdal.fa@gmail.com
 */

class MovieRepositoryImpl @Inject constructor(
    private val dispatcher: DispatcherProvider,
    private val remoteDataSource: MovieRemoteDataSource,
    private val movieMapper: MovieMapper,
    private val tvOnTheAirMapper: TvOnTheAirMapper
) : MovieRepository {
    override suspend fun getMovieNowPlaying(): Result<List<NowPlaying>> {
        return when (val apiResult = remoteDataSource.getMovieNowPlaying(dispatcher.io)) {
            is Result.Success -> Result.Success(movieMapper.map(apiResult.data))
            is Result.Error -> Result.Error(apiResult.cause, apiResult.code, apiResult.errorMessage)
            else -> Result.Error()
        }
    }

    override suspend fun getTvOnTheAir(): Result<List<TvOnTheAir>> {
        val apiResult = remoteDataSource.getTvOnTheAir(dispatcher.io)
        return when (apiResult) {
            is Result.Success -> Result.Success(tvOnTheAirMapper.map(apiResult.data))
            is Result.Error -> Result.Error(apiResult.cause, apiResult.code, apiResult.errorMessage)
            else -> Result.Error()
        }
    }
}