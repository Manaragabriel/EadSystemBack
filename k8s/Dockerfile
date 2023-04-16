FROM openjdk:17-jdk-slim

# Set the working directory to /app
WORKDIR /app

# Copy the Gradle project's jar file into the container
COPY ../api/build/libs/*.jar app.jar

# Expose the port that your Spring Boot application will run on
EXPOSE 3000

# Specify the command to run your Spring Boot application
CMD ["java", "-jar", "app.jar"]