# Kotlin WebFlux Example

Sample repository using Spring-Boot with WebFlux using reactive repository

## Setting up MongoDB

For setting up the database, the usage of Docker is recomended.

````
docker run --name mongo -d mongo:tag
````

## Kotlin REST-Api example

This API exposes the following Endpoints for the Movie resource:

1. GET All movies -> /movie
2. GET a single movie -> /movie/{id}
3. DELETE a movie -> /movie/{id}
4. INSERT a movie -> /movie (Example body):
````
{
	"title": "Test title",
	"genre": "Test genre",
	"year": 1987,
	"actors": [
		"Actor 1",
		"Actor 2",
		"Actor 3"
	]
}
````



    