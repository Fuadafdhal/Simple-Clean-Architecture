package com.afdhal_fa.simplecleanarchitecture.data.dispatcher

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject

/**
 * Created by Muh Fuad Afdhal on 9/24/2021
 * Email: fuad.afdal.fa@gmail.com
 */

class CoroutineDispatcherProvider @Inject constructor():DispatcherProvider {
    override val ui: CoroutineDispatcher
        get() = Dispatchers.Main
    override val io: CoroutineDispatcher
        get() = Dispatchers.IO
    override val default: CoroutineDispatcher
        get() = Dispatchers.Default
    override val unconfined: CoroutineDispatcher
        get() = Dispatchers.Unconfined
}