package com.imaginatic.myfirstjetpack.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.SubcomposeAsyncImage
import coil.request.ImageRequest
import com.imaginatic.myfirstjetpack.R
import com.myfirstjetpack.core.domain.model.MovieData

@Composable
fun MovieItem(
    modifier: Modifier = Modifier,
    movie: MovieData
) {
    Card(modifier = modifier
        .fillMaxWidth()
        .height(180.dp)
        .padding(8.dp)
    ) {
        Row {
            SubcomposeAsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .data(stringResource(id = R.string.image_url_string, movie.movieBackgroundImage))
                    .crossfade(true)
                    .build(),
                contentDescription = stringResource(id = R.string.movie),
                loading = { CircularProgressIndicator() },
                modifier = modifier.weight(0.8f)
            )
            Column(
                modifier = modifier.weight(2f)
            ) {
                Text(text = "What")
                Text(text = "New")
                Text(text = "Gone")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MovieItemPreview() {
    MovieItem(
        movie = MovieData(
            movieId = 1,
            movieDescription = "Description",
            movieReleaseDate = "Release",
            movieTitle = "Title",
            movieIsAdult = false,
            movieRating = 2.0,
            movieBackgroundImage = "/1E5baAaEse26fej7uHcjOgEE2t2.jpg",
            movieLandscapeImage = "/iGdHtZBjpBkmSAgkvUeniIfI8ME.jpg",
            movieIsVisited = false,
            movieIsFavorite = false,
            movieDate = "1970-12-30",
            movieIsSearchResult = false,
            movieIsHomeResult = true
        )
    )
}