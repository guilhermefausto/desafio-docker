FROM eclipse-temurin:17.0.13_11-jdk-alpine

WORKDIR /service

COPY pom.xml mvnw ./

COPY src ./src

COPY .mvn ./.mvn

RUN chmod +x ./mvnw

RUN ./mvnw package -DskipTests

RUN mv ./target/*.jar ./app.jar

EXPOSE 8080

CMD ["java", "-jar", "./app.jar"]