FROM openjdk:24-slim-bookworm

RUN mkdir -p /opt/java-app

WORKDIR /opt/java-app

COPY /target/Demo-0.0.1.jar /opt/java-app/app.jar

CMD ["java","-jar","app.jar"]