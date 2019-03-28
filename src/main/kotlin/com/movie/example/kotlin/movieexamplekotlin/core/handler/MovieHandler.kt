package com.movie.example.kotlin.movieexamplekotlin.core.handler

import com.movie.example.kotlin.movieexamplekotlin.core.model.Movie
import com.movie.example.kotlin.movieexamplekotlin.core.service.MovieService
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse

@Component
class MovieHandler(private val movieService: MovieService) {

    fun getAllMovies(request: ServerRequest) = ServerResponse.ok()
            .contentType(MediaType.APPLICATION_JSON)
            .body(movieService.getAllMovies(), Movie::class.java)

    fun getMovie(request: ServerRequest) = ServerResponse.ok()
            .contentType(MediaType.APPLICATION_JSON)
            .body(movieService.findById(request.pathVariable("id")), Movie::class.java)
            .switchIfEmpty(ServerResponse.notFound().build())

    fun addMovie(request: ServerRequest) = request.bodyToMono(Movie::class.java).flatMap(::saveMovie)

    fun deleteMovie(request: ServerRequest) = ServerResponse.status(HttpStatus.NO_CONTENT)
            .body(movieService.deleteOne(request.pathVariable("id")), Void::class.java)

    fun saveMovie(movie: Movie) = ServerResponse.status(HttpStatus.CREATED)
            .contentType(MediaType.APPLICATION_JSON)
            .body(movieService.insertOne(movie), Movie::class.java)
}