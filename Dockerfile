# Use OpenJDK 17 as base image
FROM openjdk:17-jdk-slim

# Set working directory
WORKDIR /app

# Copy the JAR file
COPY target/scientific-calculator-1.0-SNAPSHOT.jar /app/calculator.jar

# Run the application
CMD ["java", "-jar", "calculator.jar"]
