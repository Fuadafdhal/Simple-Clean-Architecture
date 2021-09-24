package com.afdhal_fa.simplecleanarchitecture.domain.repository

import com.afdhal_fa.simplecleanarchitecture.data.vo.Result
import com.afdhal_fa.simplecleanarchitecture.domain.entity.NowPlaying
import com.afdhal_fa.simplecleanarchitecture.domain.entity.TvOnTheAir

/**
 * Created by Muh Fuad Afdhal on 9/24/2021
 * Email: fuad.afdal.fa@gmail.com
 */

interface MovieRepository {
    suspend fun getMovieNowPlaying(): Result<List<NowPlaying>>

    suspend fun getTvOnTheAir(): Result<List<TvOnTheAir>>
}