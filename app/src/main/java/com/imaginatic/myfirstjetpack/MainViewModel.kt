package com.imaginatic.myfirstjetpack

import androidx.lifecycle.ViewModel
import com.myfirstjetpack.core.domain.usecase.MoviesUseCase
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val moviesUseCase: MoviesUseCase
): ViewModel(){
    val movies = moviesUseCase.getAllMovies()
}