./gradlew clean && ./gradlew bootJar

docker build -t mathlimma/campibus-core .

docker image push mathlimma/campibus-core:latest