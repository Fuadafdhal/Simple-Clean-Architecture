package com.afdhal_fa.simplecleanarchitecture.domain.usecase

import com.afdhal_fa.simplecleanarchitecture.abstraction.UseCase
import com.afdhal_fa.simplecleanarchitecture.data.vo.Result
import com.afdhal_fa.simplecleanarchitecture.domain.entity.NowPlaying
import com.afdhal_fa.simplecleanarchitecture.domain.repository.MovieRepository
import javax.inject.Inject

/**
 * Created by Muh Fuad Afdhal on 9/24/2021
 * Email: fuad.afdal.fa@gmail.com
 */

class GetMovieNowPlayingUseCase @Inject constructor(
    private val movieRepository: MovieRepository
) : UseCase<UseCase.None, Result<List<NowPlaying>>>() {
    override suspend fun invoke(params: None): Result<List<NowPlaying>> {
        return movieRepository.getMovieNowPlaying()
    }
}