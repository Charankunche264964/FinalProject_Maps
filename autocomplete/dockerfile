FROM openjdk:17-jdk-slim

WORKDIR /home/chandrasekharkunche/Downloads/autocompletepro/autocomplete

COPY /target/autocomplete-0.0.1-SNAPSHOT.jar /app/autocomplete.jar

EXPOSE 8089

ENTRYPOINT [ "java" , "-jar", "/app/autocomplete.jar"]