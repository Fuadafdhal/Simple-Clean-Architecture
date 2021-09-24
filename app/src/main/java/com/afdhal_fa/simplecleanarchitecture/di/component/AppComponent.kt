package com.afdhal_fa.simplecleanarchitecture.di.component

import com.afdhal_fa.simplecleanarchitecture.MyApp
import com.afdhal_fa.simplecleanarchitecture.di.module.*
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

/**
 * Created by Muh Fuad Afdhal on 9/24/2021
 * Email: fuad.afdal.fa@gmail.com
 */
@Singleton
@Component(
    modules = [
        AppModule::class,
        NetworkModule::class,
        RepositoryModule::class,
        AndroidInjectionModule::class,
        ActivityBuilder::class,
        ViewModelModule::class,
        ApiServiceModule::class,
        CoroutineDispatcherModule::class
    ]
)
interface AppComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: MyApp): Builder

        fun build(): AppComponent
    }

    fun inject(app: MyApp)
}