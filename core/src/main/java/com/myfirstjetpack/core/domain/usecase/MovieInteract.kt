package com.myfirstjetpack.core.domain.usecase

import com.myfirstjetpack.core.data.MovieRepository
import com.myfirstjetpack.core.data.Resource
import com.myfirstjetpack.core.domain.model.GenreData
import com.myfirstjetpack.core.domain.model.MovieData
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class MovieInteract @Inject constructor(private val movieRepository: MovieRepository): MoviesUseCase{
    override fun getAllMovies(): Flow<Resource<List<MovieData>>> = movieRepository.getAllMovies()
    override fun getSearchMovies(movieName: String): Flow<Resource<List<MovieData>>> = movieRepository.getSearchMovies(movieName)
    override fun getMovieDetailByMovieId(movieId: Int): Flow<Resource<List<MovieData>>> = movieRepository.getMovieDetailByMovieId(movieId)
    override fun getGenreByMovieId(movieId: Int): Flow<List<GenreData>> = movieRepository.getGenreByMovieId(movieId)
    override fun getFavoriteMovie(): Flow<List<MovieData>> = movieRepository.getFavoriteMovie()
    override fun getSearchFavorite(movieName: String): Flow<List<MovieData>> = movieRepository.getSearchFavorite(movieName)
    override fun setFavoriteMovie(movieData: MovieData, state: Boolean) = movieRepository.setFavoriteMovie(movieData, state)
}