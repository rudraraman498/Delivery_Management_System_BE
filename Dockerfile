# Use OpenJDK 17 image
FROM openjdk:17-jdk-slim

# Set working directory
WORKDIR /app

# Copy Maven dependencies
COPY target/springboot-backend-0.0.1-SNAPSHOT.jar app.jar

# Run the application
CMD ["java", "-jar", "app.jar"]


#docker build -t springboot-backend .
# docker run -e DB_URL=jdbc:mysql://your-cloud-mysql-server:3306/travel_db \
#              -e DB_USER=your-db-user \
#              -e DB_PASSWORD=your-db-password \
#              -p 8080:8080 springboot-backend
