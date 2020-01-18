# Challenge Mutantes
![](https://github.com/matiasdgreco/challenge-mutantes/workflows/Java%20CI/badge.svg)

## Entorno local
Para correr la aplicación de forma local es necesario ejectuar el siguiente comando `./gradlew run`

## Entorno web
`https://stormy-tundra-46224.herokuapp.com`

### Enpoints:
#### POST -> /mutant/
Analiza una cadena de ADN y devuelve los siguientes códigos de estado:
1. 200 en caso de ser un mutante
2. 403 en caso de no ser un muntante

Ejemplo: `curl --header "Content-Type: application/json" \
             --request POST \
             --data '{"dna":["ATGCGA","CAGTGC","TTATGT","AGAAGG","CCCCTA","TCACTG"]}' \
             https://stormy-tundra-46224.herokuapp.com/mutant/` 
