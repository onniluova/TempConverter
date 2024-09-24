FROM maven:3.9.5-eclipse-temurin-21
WORKDIR /app
COPY pom.xml .
RUN mvn dependency:go-offline
COPY src ./src
RUN mvn package -X
CMD ["java", "-jar", "target/jenkinstask2-1.0-SNAPSHOT.jar"]
