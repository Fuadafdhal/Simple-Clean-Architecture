package com.afdhal_fa.simplecleanarchitecture.di.module

import com.afdhal_fa.simplecleanarchitecture.data.repository.MovieRepositoryImpl
import com.afdhal_fa.simplecleanarchitecture.domain.repository.MovieRepository
import dagger.Binds
import dagger.Module

/**
 * Created by Muh Fuad Afdhal on 9/24/2021
 * Email: fuad.afdal.fa@gmail.com
 */

@Module
interface RepositoryModule {
    @Binds
    fun bindMovieRepository(repository: MovieRepositoryImpl):MovieRepository
}