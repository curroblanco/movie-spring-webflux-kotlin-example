package com.movie.example.kotlin.movieexamplekotlin

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.reactive.config.EnableWebFlux

@SpringBootApplication
@EnableWebFlux
@EnableAutoConfiguration
class MovieExampleKotlinApplication

fun main(args: Array<String>) {
	runApplication<MovieExampleKotlinApplication>(*args)
}
