#define base docker image
FROM openjdk:11
LABEL maintainer="springdocker"
ADD target/docker-jenkin-integration-0.0.1-SNAPSHOT.jar docker-jenkin-integration.jar
ENTRYPOINT ["java", "-jar","docker-jenkin-integration.jar"]