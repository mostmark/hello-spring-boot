###
# Before building the container image run:
#
# ./mvn package
#
# Then, build the image with:
#
# docker build -f src/main/docker/Dockerfile -t mostmark/hello-spring-boot .
#
# Then run the container using:
#
# docker run -i --rm -p 8080:8080 mostmark/hello-spring-boot
#
###
FROM registry.access.redhat.com/ubi8/openjdk-11:latest

ENV LANGUAGE='en_US:en'

COPY --chown=185 target/*.jar /deployments/

EXPOSE 8080
USER 185
ENV AB_JOLOKIA_OFF=""
ENV JAVA_APP_JAR="/deployments/hello-spring-boot-1.0.jar"

