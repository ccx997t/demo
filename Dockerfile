FROM openjdk:8-jdk-alpine
EXPOSE 8080
COPY target/demo-1.jar demo-1.jar
ENTRYPOINT ["java","-jar","/demo-1.jar"]