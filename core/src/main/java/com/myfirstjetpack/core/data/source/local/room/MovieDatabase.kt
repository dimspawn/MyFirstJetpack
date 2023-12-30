package com.myfirstjetpack.core.data.source.local.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.myfirstjetpack.core.data.source.local.entity.MovieEntity
import com.myfirstjetpack.core.data.source.local.entity.MovieGenreEntity

@Database(entities = [MovieEntity::class, MovieGenreEntity::class], version = 1, exportSchema = false)
abstract class MovieDatabase: RoomDatabase() {
    abstract fun movieDao(): MovieDao
}