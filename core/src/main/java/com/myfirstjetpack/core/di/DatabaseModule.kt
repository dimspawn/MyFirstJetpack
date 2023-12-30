package com.myfirstjetpack.core.di

import android.content.Context
import androidx.room.Room
import com.myfirstjetpack.core.data.source.local.room.MovieDao
import com.myfirstjetpack.core.data.source.local.room.MovieDatabase
import dagger.Module
import dagger.Provides

@Module
class DatabaseModule {
    @CoreScope
    @Provides
    fun provideDatabase(context: Context): MovieDatabase {
        return Room.databaseBuilder(
            context,
            MovieDatabase::class.java, "Movies.db"
        ).fallbackToDestructiveMigration()
            .build()
    }

    @Provides
    fun providesGameDao(database: MovieDatabase): MovieDao = database.movieDao()
}