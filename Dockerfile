# Use OpenJDK 17 as the base image
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the built JAR file into the container
COPY target/ammas-kitchen.jar app.jar

# Command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
