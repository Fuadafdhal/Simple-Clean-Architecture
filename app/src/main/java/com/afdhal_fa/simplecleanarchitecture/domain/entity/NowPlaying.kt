package com.afdhal_fa.simplecleanarchitecture.domain.entity

/**
 * Created by Muh Fuad Afdhal on 9/24/2021
 * Email: fuad.afdal.fa@gmail.com
 */

data class NowPlaying(
    val id: Int,
    val overview: String,
    val posterPath: String,
    val title: String
)