FROM eclipse-temurin:21-jdk-alpine as builder

WORKDIR /app/user-service

COPY ./pom.xml /app
COPY ./rental-user-service/.mvn ./.mvn
COPY ./rental-user-service/mvnw .
COPY ./rental-user-service/pom.xml .

#RUN ./mvnw clean package -Dmaven.test.skip -Dmaven.main.skip -Dspring-boot.repackage.skip && rm -r ./target/
RUN ./mvnw dependency:go-offline
COPY ./rental-user-service/src ./src

RUN ./mvnw clean package -DskipTests

FROM eclipse-temurin:21-jdk-alpine

WORKDIR /app
RUN mkdir ./logs
COPY --from=builder /app/rental-user-service/target/rental-user-service-1.0.0.jar .
EXPOSE 9001
CMD ["java", "-jar", "rental-user-service-1.0.0.jar"]