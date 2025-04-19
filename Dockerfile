FROM openjdk:21-jdk-slim
WORKDIR /app
COPY . .
CMD ["java", "-jar", "target/training-springboot-docker-sample-0.0.1-SNAPSHOT.jar"]

