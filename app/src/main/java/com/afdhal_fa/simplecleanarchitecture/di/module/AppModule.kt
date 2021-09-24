package com.afdhal_fa.simplecleanarchitecture.di.module

import android.app.Application
import android.content.Context
import com.afdhal_fa.simplecleanarchitecture.MyApp
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by Muh Fuad Afdhal on 9/24/2021
 * Email: fuad.afdal.fa@gmail.com
 */

@Module
class AppModule {
    @Provides
    @Singleton
    fun provideContext(app: MyApp): Context = app

    @Provides
    @Singleton
    fun provideApplication(app: MyApp): Application = app
}