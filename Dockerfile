FROM openjdk:8
ADD target/bassem-docker-spring.jar bassem-docker-spring.jar
EXPOSE 8089
ENTRYPOINT ["java", "-jar", "bassem-docker-spring.jar"]