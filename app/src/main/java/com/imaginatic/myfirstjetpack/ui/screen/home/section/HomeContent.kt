package com.imaginatic.myfirstjetpack.ui.screen.home.section

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.imaginatic.myfirstjetpack.ui.components.EmptyMovies
import com.imaginatic.myfirstjetpack.ui.components.MovieItem
import com.myfirstjetpack.core.domain.model.MovieData

@Composable
fun HomeContent(
    movies: List<MovieData>?
) {
    Column(modifier = Modifier.fillMaxSize()) {
        if (movies != null) {
            LazyVerticalGrid(
                columns = GridCells.Fixed(1),
                content = {
                    items(movies, key = { it.movieId }) { movie ->
                        MovieItem(movie = movie)
                    }
                }
            )
            if (movies.isEmpty()) EmptyMovies()
        } else EmptyMovies()
    }
}