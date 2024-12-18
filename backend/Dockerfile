FROM maven:eclipse-temurin AS build

WORKDIR /app

COPY pom.xml .

COPY src ./src

RUN mvn clean package -DskipTests

FROM eclipse-temurin:17.0.13_11-jre-noble

WORKDIR /service

COPY --from=build /app/target/*.jar ./app.jar

EXPOSE 8080

CMD ["java", "-jar", "./app.jar"]