package com.movie.example.kotlin.movieexamplekotlin.core.service

import com.movie.example.kotlin.movieexamplekotlin.core.model.Movie
import com.movie.example.kotlin.movieexamplekotlin.core.repository.MovieReactiveRepository
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
class MovieService(private val movieRepository : MovieReactiveRepository)  {
    fun getAllMovies(): Flux<Movie> = movieRepository.findAll()
    fun findById(id: String): Mono<Movie> = movieRepository.findById(id)
    fun insertOne(movie: Movie): Mono<Movie> = movieRepository.save(movie)
    fun deleteOne(id: String): Mono<Void> = movieRepository.deleteById(id)
}