./gradlew clean && ./gradlew bootJar

docker build -t mathlimma/campibus-digital-wallet .

docker image push mathlimma/campibus-digital-wallet:latest