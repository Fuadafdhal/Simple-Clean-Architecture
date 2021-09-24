package com.afdhal_fa.simplecleanarchitecture.data.mapper

import com.afdhal_fa.simplecleanarchitecture.abstraction.Mapper
import com.afdhal_fa.simplecleanarchitecture.data.response.NowPlayingDto
import com.afdhal_fa.simplecleanarchitecture.domain.entity.NowPlaying
import javax.inject.Inject

/**
 * Created by Muh Fuad Afdhal on 9/24/2021
 * Email: fuad.afdal.fa@gmail.com
 */

class MovieMapper @Inject constructor() : Mapper<NowPlayingDto, List<NowPlaying>>() {
    override fun map(input: NowPlayingDto): List<NowPlaying> {
        return input.results?.map {
            NowPlaying(
                id = it.id ?: 0,
                overview = it.overview ?: "",
                posterPath = it.posterPath ?: "",
                title = it.title ?: ""
            )
        } ?: emptyList()
    }
}