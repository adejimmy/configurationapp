FROM openjdk:11-alpine
VOLUME /tmp
COPY target/configuration-0.0.1-SNAPSHOT.jar configurationapp.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/configurationapp.jar"]