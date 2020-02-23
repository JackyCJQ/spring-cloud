FROM java:8
ADD target/app03-1.0.0.jar /app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]
#docker build -t jacky/jacky-demo .
#docker run -d -p 8080:8080 --name jacky-demo jacky/demo