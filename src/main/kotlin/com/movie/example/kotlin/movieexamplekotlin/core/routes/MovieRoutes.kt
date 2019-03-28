package com.movie.example.kotlin.movieexamplekotlin.core.routes

import com.movie.example.kotlin.movieexamplekotlin.core.handler.MovieHandler
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.MediaType
import org.springframework.web.reactive.function.server.router

@Configuration
class MovieRoutes(private val movieHandler: MovieHandler) {

    @Bean
    fun router(movieHandler: MovieHandler) = router {
        accept(MediaType.APPLICATION_JSON).nest {
            "/movie".nest {
                GET("/", movieHandler::getAllMovies)
                POST("/", movieHandler::addMovie)
                GET("/{id}", movieHandler::getMovie)
                DELETE("/{id}", movieHandler::deleteMovie)
            }
        }
    }
}

