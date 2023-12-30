package com.myfirstjetpack.core.data.source.local.entity

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(
    tableName = "genre",
    foreignKeys = [
        ForeignKey(entity = MovieEntity::class,
        parentColumns = ["movieId"],
        childColumns = ["movieId"],
        onDelete = ForeignKey.CASCADE,
        onUpdate = ForeignKey.CASCADE)],
        indices = [Index(value = ["movieId"])
    ]
)
data class MovieGenreEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "genreId")
    var genreId: Int = 0,

    @ColumnInfo(name = "movieId")
    var movieId: Int,

    @ColumnInfo(name = "genreName")
    var genreName: String
): Parcelable