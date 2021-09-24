package com.afdhal_fa.simplecleanarchitecture.abstraction

/**
 * Created by Muh Fuad Afdhal on 9/24/2021
 * Email: fuad.afdal.fa@gmail.com
 */

abstract class Mapper<in I, out O> {
    abstract fun map(input: I): O
}