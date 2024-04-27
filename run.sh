#/usr/bin/sh

cd klikmylink

./gradlew clean
./gradlew build -x test

docker-compose down

docker-compose build

docker-compose up