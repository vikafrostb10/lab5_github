# To change this license header, choose License Headers in Project Properties.
FROM adoptopenjdk/openjdk13:x86_64-alpine-jdk-13.0.2_8
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar 
ENTRYPOINT {"java","jar","/app.jar"}