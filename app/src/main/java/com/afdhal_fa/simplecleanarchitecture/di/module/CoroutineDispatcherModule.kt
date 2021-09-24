package com.afdhal_fa.simplecleanarchitecture.di.module

import com.afdhal_fa.simplecleanarchitecture.data.dispatcher.CoroutineDispatcherProvider
import com.afdhal_fa.simplecleanarchitecture.data.dispatcher.DispatcherProvider
import dagger.Binds
import dagger.Module

/**
 * Created by Muh Fuad Afdhal on 9/24/2021
 * Email: fuad.afdal.fa@gmail.com
 */

@Module
interface CoroutineDispatcherModule {
    @Binds
    fun bindDispatcher(dispatcherProvider: CoroutineDispatcherProvider): DispatcherProvider
}