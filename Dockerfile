# To change this license header, choose License Headers in Project Properties.
FROM alpine:3.4
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar 
ENTRYPOINT {"java","jar","/app.jar"}
