from openjdk:8-jdk-slim
label maintainer=donglin

copy taget/*.jar /app.jar

entrypoint ["java","-jar","app.jar"]