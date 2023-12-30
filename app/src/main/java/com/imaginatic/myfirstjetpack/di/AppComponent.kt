package com.imaginatic.myfirstjetpack.di

import com.imaginatic.myfirstjetpack.MainActivity
import com.myfirstjetpack.core.di.CoreComponent
import com.myfirstjetpack.core.domain.usecase.MoviesUseCase
import dagger.Component

@AppScope
@Component(modules = [ViewModelModule::class], dependencies = [CoreComponent::class])
interface AppComponent {
    @Component.Builder
    interface Builder {
        fun coreComponent(coreComponent: CoreComponent): Builder
        fun build(): AppComponent
    }

    fun provideMoviesUseCase(): MoviesUseCase
    fun inject(activity: MainActivity)
}