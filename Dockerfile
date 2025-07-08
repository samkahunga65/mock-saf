# Stage 1: Build the application using Maven
FROM maven:3.9.6-eclipse-temurin-17 AS builder
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Stage 2: Run the application
FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
WORKDIR /app
COPY --from=builder /app/target/*.jar app.jar

# Use a non-root user (optional for security)
RUN adduser -D springuser
USER springuser

ENTRYPOINT ["java", "-jar", "app.jar"]
