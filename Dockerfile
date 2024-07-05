FROM node:20.15-slim

RUN mkdir -p /opt/reactApp
RUN mkdir -p /opt/java-app

#First copy all java files
WORKDIR /opt/java-app

COPY Java/src ./src
COPY Java/pom.xml ./pom.xml
COPY Java/mvnw ./mvnw
COPY Java/.mvn ./.mvn

#Static building
WORKDIR /opt/reactApp

COPY React_files/demo_app/package.json .
COPY React_files/demo_app/package-lock.json .

RUN npm install

COPY React_files/demo_app/public ./public
COPY React_files/demo_app/src ./src

RUN npm run build

# COPY /build /opt/java-app/src/main/resources/static

#Java building
FROM openjdk:24-ea-4-jdk-slim-bookworm

WORKDIR /opt/java-app

COPY --from=0 /opt/reactApp/build /opt/java-app/src/main/resources/static

RUN chmod +x mvnw

RUN ./mvnw clean install

CMD ["./mvnw", "exec:java"]