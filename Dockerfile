FROM java:8

VOLUME /tmp
ADD /target/dockerfile-demo.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]