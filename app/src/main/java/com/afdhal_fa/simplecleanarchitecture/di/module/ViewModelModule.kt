package com.afdhal_fa.simplecleanarchitecture.di.module

import android.text.Editable
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.afdhal_fa.simplecleanarchitecture.persentation.home.HomeViewModel
import com.afdhal_fa.simplecleanarchitecture.util.ViewModelFactory
import com.afdhal_fa.simplecleanarchitecture.util.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

/**
 * Created by Muh Fuad Afdhal on 9/24/2021
 * Email: fuad.afdal.fa@gmail.com
 */

@Module
abstract class ViewModelModule {
    @Binds
    internal abstract fun bindViewModelFactory(factory: ViewModelFactory):ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(HomeViewModel::class)
    internal abstract fun providesHomeViewModel(viewModel: HomeViewModel):ViewModel
}