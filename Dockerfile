FROM ubuntu:latest AS build
RUN apt-get update
RUN apt-get install openjdk-17-jdk -y
COPY . .

RUN .\gradlew.bat build -x test
RUN ./gradlew bootJar --no-daemon

FROM --platform=linux/amd64 openjdk:17-alpine
ARG JAR_FILE=klikmylink/build/libs/klikmylink-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
EXPOSE 9099
ENTRYPOINT ["java","-jar","/app.jar"]