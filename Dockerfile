FROM openjdk:latest

WORKDIR /app
COPY . /app

RUN javac SumOfMinAndMax.java
CMD ["java", "SumOfMinAndMax"]
