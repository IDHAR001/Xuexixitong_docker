FROM maven:3.8.4-jdk-11 AS builder
COPY src /usr/src/app/src
COPY pom.xml /usr/src/app
RUN mvn -f /usr/src/app/pom.xml clean package -Dmaven.test.skip=true

FROM adoptopenjdk/openjdk11:jdk-11.0.11_9-alpine
WORKDIR /app
COPY --from=builder /usr/src/app/target/*.jar /app/app.jar
ENTRYPOINT ["java","-jar","app.jar"]