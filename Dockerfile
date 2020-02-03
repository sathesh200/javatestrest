FROM centos
FROM openjdk:8
COPY ./target/TestWebService-1.0.0.war /tmp
#COPY ./src/main/resources/*.xml /tmp
COPY ./src/main/resources/application.properties /tmp
WORKDIR /tmp
ENTRYPOINT ["java", "-jar","TestWebService-1.0.0.war"]