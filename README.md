# Challenge Mutantes
![](https://github.com/matiasdgreco/challenge-mutantes/workflows/Java%20CI/badge.svg)

API REST para el challenge técnico de BE de MercadoLibre.  
Consta de un endpoint que recibe una matriz de strings (correspondientes a una cadena de ADN) y se analiza si se trata de un mutante o un humano.  
Adicionalmente, se expone otro endpoint para obtener las estadísticas de los casos analizados.

## Tecnologías utilizadas
Se utilizó [Java](https://www.java.com/es/) como lenguaje de programación, [JUnit](https://junit.org/junit5/) como framework de test y [Spring Boot](https://spring.io/projects/spring-boot) como framework de desarrollo.  
La base de datos es [PostgreSQL](https://www.postgresql.org/) ya que es la brindada por entorno de producción, [Heroku](https://www.heroku.com/). Se utilizó [Docker](https://www.docker.com/) para brindar dicha base de datos en el entorno local.  
Para CI se utilizó [GitHub Actions](https://github.com/features/actions).  
El workflow de trabajo actual está configurado para hacer un build de la app en cada push al repositorio de GitHub para corroborar que se compile y se ejecuten los test. Cuando se hace un push al branch master (si el build fue correcto), se realiza el deploy en Heroku.

## Ejecutar la app de forma local
### Requisitos:
* Java 8
* Docker o PostgreSQL instalado
* [Postman](https://www.getpostman.com/) o similar para realizar las request (en los ejemplos se utiliza [Curl](https://curl.haxx.se/))

### Pasos a seguir
1. Se necesitan definir tres variables de entorno para realizar la conexión a la base de datos:
    * `export DATABASE_URL={url de la base de datos}}`
    * `export DATABASE_USERNAME={usuario de la base de datos}`
    * `export DATABASE_PASSWORD={password del usuario de la base de datos}`
2. En caso de no tener PostgreSQL instalado, se puede utilizar un container de Docker:
    * ```shell script
      docker run --name {nombre del container} \
          -p 5432:5432 \
          -e POSTGRES_DB={nombre de la base de datos} \
          -e POSTGRES_PASSWORD={password del usuario de la base de datos} \
          -d postgres
      ```
      1. El puerto escogido fue el defecto (5432)
      2. La imagen utilizada fue la oficial (postgres)
3. Ejectuar el siguiente comando desde la raíz del repositorio para iniciar la app `./gradlew run`
4. Por defecto, Spring Boot utiliza el puerto 8080 quedando como URL: http://localhost:8080
## Entorno de producción
URL: https://stormy-tundra-46224.herokuapp.com

## Enpoints disponibles
### POST -> /mutant/
#### Ejemplo request
```shell script
curl --header "Content-Type: application/json" \
     --request POST \
     --data '{"dna":["ATGCGA","CAGTGC","TTATGT","AGAAGG","CCCCTA","TCACTG"]}' \
     http://localhost:8080/mutant/
```
#### Posibles response
1. Status code 200 en caso de ser un mutante
2. Status code 403 en caso de ser un humano
### GET -> /stats
#### Ejemplo request
```shell script
curl http://localhost:8080/stats
```
#### Ejemplo response
```json
{
  "count_mutant_dna": 40,
  "count_human_dna": 100,
  "ratio": 0.4
}
```

## Contacto
[matiasdgreco@gmail.com](mailto:mailto:matiasdgreco@gmail.com)
