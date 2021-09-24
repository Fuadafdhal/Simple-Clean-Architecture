package com.afdhal_fa.simplecleanarchitecture.data.response

import com.squareup.moshi.Json

/**
 * Created by Muh Fuad Afdhal on 9/24/2021
 * Email: fuad.afdal.fa@gmail.com
 */

data class TvOnTheAirDto(
    @field:Json(name = "results")
    val results: List<Result>?
) {
    data class Result(
        @field:Json(name = "id")
        val id: Int?,
        @field:Json(name = "name")
        val name: String?,
        @field:Json(name = "overview")
        val overview: String?,
        @field:Json(name = "poster_path")
        val posterPath: String?
    )
}
