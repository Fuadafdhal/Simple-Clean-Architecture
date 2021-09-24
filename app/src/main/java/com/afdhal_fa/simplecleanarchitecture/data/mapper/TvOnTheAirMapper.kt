package com.afdhal_fa.simplecleanarchitecture.data.mapper

import com.afdhal_fa.simplecleanarchitecture.abstraction.Mapper
import com.afdhal_fa.simplecleanarchitecture.data.response.TvOnTheAirDto
import com.afdhal_fa.simplecleanarchitecture.domain.entity.TvOnTheAir
import javax.inject.Inject

/**
 * Created by Muh Fuad Afdhal on 9/24/2021
 * Email: fuad.afdal.fa@gmail.com
 */

class TvOnTheAirMapper @Inject constructor() : Mapper<TvOnTheAirDto, List<TvOnTheAir>>() {
    override fun map(input: TvOnTheAirDto): List<TvOnTheAir> {
        return input.results?.map {
            TvOnTheAir(
                id = it.id ?: 0,
                overview = it.overview ?: "",
                posterPath = it.posterPath ?: "",
                name = it.name ?: ""
            )
        } ?: emptyList()
    }
}