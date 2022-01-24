FROM adoptopenjdk/openjdk11:latest
#RUN apt-get -y update
#RUN apt-get install -y maven
#COPY pom.xml .
#RUN  mvn clean install
ADD target/ch6-1-0.0.1-SNAPSHOT.jar app.jar
#COPY /src/main/resources/application-* /src/main/resources/application.* ./
COPY . .
ENTRYPOINT ["java","-jar","app.jar"]


#
# Build stage
#
FROM maven:3.6.0-jdk-11-slim AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean install

#
# Package stage
#
FROM openjdk:11-jre-slim
COPY --from=build /home/app/target/ch6-1-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]