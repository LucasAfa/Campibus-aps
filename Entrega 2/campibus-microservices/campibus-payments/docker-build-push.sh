./gradlew clean && ./gradlew bootJar

docker build -t mathlimma/campibus-payments .

docker image push mathlimma/campibus-payments:latest