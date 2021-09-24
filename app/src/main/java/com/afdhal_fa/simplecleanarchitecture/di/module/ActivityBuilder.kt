package com.afdhal_fa.simplecleanarchitecture.di.module

import com.afdhal_fa.simplecleanarchitecture.persentation.home.HomeActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by Muh Fuad Afdhal on 9/24/2021
 * Email: fuad.afdal.fa@gmail.com
 */

@Module
abstract class ActivityBuilder {
    @ContributesAndroidInjector
    abstract fun contributesHomeActivity():HomeActivity
}