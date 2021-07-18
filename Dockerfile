FROM adoptopenjdk/openjdk8:alpine-jre
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} taxaSelicCompra.jar
ENTRYPOINT ["java","-jar","taxaSelicCompra.jar"]