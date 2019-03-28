package com.movie.example.kotlin.movieexamplekotlin.core.repository

import com.movie.example.kotlin.movieexamplekotlin.core.model.Movie
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository

@Repository
interface MovieReactiveRepository : ReactiveMongoRepository<Movie, String> {

}