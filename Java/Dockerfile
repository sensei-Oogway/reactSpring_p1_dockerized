FROM openjdk:24-ea-4-jdk-slim-bookworm

RUN mkdir -p /opt/java-app

WORKDIR /opt/java-app

COPY src ./src
COPY pom.xml ./pom.xml
COPY mvnw ./mvnw
COPY .mvn ./.mvn

RUN chmod +x mvnw

RUN ./mvnw clean install

CMD ["./mvnw", "exec:java"]