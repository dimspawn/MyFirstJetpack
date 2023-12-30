package com.myfirstjetpack.core.di

import com.myfirstjetpack.core.data.MovieRepository
import com.myfirstjetpack.core.domain.repository.IMovieRepository
import com.myfirstjetpack.core.domain.usecase.MovieInteract
import com.myfirstjetpack.core.domain.usecase.MoviesUseCase
import dagger.Binds
import dagger.Module

@Module(includes = [NetworkModule::class, DatabaseModule::class])
abstract class RepositoryModule {
    @Binds
    abstract fun provideRepository(movieRepository: MovieRepository): IMovieRepository

    @Binds
    abstract fun provideMovieUseCase(movieInteract: MovieInteract): MoviesUseCase
}