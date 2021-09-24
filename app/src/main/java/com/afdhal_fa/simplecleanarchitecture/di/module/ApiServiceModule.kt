package com.afdhal_fa.simplecleanarchitecture.di.module

import com.afdhal_fa.simplecleanarchitecture.data.sevice.MovieService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

/**
 * Created by Muh Fuad Afdhal on 9/24/2021
 * Email: fuad.afdal.fa@gmail.com
 */

@Module
class ApiServiceModule {
    @Provides
    @Singleton
    fun providesMovieService(retrofit: Retrofit) = retrofit.create(MovieService::class.java)
}