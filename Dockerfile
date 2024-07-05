FROM node:20.15-slim

RUN mkdir -p /opt/reactApp
RUN mkdir -p /opt/java-app

#First copy all java files
WORKDIR /opt/java-app

COPY Java/src ./src
COPY pom.xml ./pom.xml
COPY mvnw ./mvnw
COPY .mvn ./.mvn

#Static building
WORKDIR /opt/reactApp

COPY /package.json .
COPY /package-lock.json .

RUN npm install

COPY /public ./public
COPY /src ./src

RUN npm run build

# COPY /build /opt/java-app/src/main/resources/static

#Java building
FROM openjdk:24-ea-4-jdk-slim-bookworm

WORKDIR /opt/java-app

COPY --from=0 /opt/reactApp/build /opt/java-app/src/main/resources/static

RUN chmod +x mvnw

RUN ./mvnw clean install

CMD ["./mvnw", "exec:java"]