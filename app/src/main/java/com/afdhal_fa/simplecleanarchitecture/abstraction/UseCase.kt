package com.afdhal_fa.simplecleanarchitecture.abstraction

/**
 * Created by Muh Fuad Afdhal on 9/24/2021
 * Email: fuad.afdal.fa@gmail.com
 */

abstract class UseCase<Params, out T> {
    abstract suspend operator fun invoke(params: Params): T

    object None
}