# Kotlin WebFlux Example

Sample repository using Spring-Boot with WebFlux using reactive repository

## Requirements

Having both **Docker** and **Docker-Compose** tools installed on your OS.

## Instructions

Running the following command on your project's main directory:

````
docker-compose up
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

* Example Movie CURL Post

```
curl -X POST \
  http://localhost:8080/movies \
  -H 'Accept: */*' \
  -H 'Accept-Encoding: gzip, deflate' \
  -H 'Cache-Control: no-cache' \
  -H 'Connection: keep-alive' \
  -H 'Content-Length: 163' \
  -H 'Content-Type: application/json' \
  -H 'Host: localhost:8080' \
  -H 'cache-control: no-cache' \
  -d '{
	"title": "Example title",
	"genre": "Example Genre",
	"year": 1990,
	"actors": [
		"Actor 1",
		"Actor 2"
		]
}'
```

    