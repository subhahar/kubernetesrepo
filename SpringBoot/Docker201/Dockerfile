FROM java:8-jre
WORKDIR /usr/src
ENV MYSQL_URL=jdbc:mysql://localhost:3306/test
ENV MY_SQL_USER=test
ENV MY_SQL_PASSWORD=test
ADD ./target/docker201-0.0.1-SNAPSHOT.jar /usr/src/docker201-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","docker201-0.0.1-SNAPSHOT.jar"]
