FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/*.jar app1.jar
ENTRYPOINT ["java","-jar","/app1.jar"]