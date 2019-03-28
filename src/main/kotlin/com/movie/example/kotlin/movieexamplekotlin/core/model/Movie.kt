package com.movie.example.kotlin.movieexamplekotlin.core.model

import org.springframework.data.annotation.Id
import java.util.*

data class Movie(
        @Id
        val id: String = "${System.nanoTime()}-${UUID.randomUUID()}",
        val title: String,
        val genre: String,
        val year: Int,
        val actors: List<String>
)