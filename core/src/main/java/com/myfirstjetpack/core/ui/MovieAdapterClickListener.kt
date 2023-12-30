package com.myfirstjetpack.core.ui

import com.myfirstjetpack.core.domain.model.MovieData

interface MovieAdapterClickListener {
    fun onMovieClickListener(movieData: MovieData)
}