#FROM java:8
#ADD target/app03.jar /opt/app.jar
#EXPOSE 8080
#ENTRYPOINT ["java","-jar","/opt/app.jar"]
#docker build -t jacky/jacky-demo .
#docker run -d -p 8080:8080 --name jacky-demo jacky/demo


FROM envoyproxy/envoy-alpine:latest
COPY envoy-config.yaml /etc/envoy/envoy.yaml

#docker run --rm -d --name app --network=container:envoytest jacky/jacky-demo
#docker run --rm -d --name envoytest -p 10000:10000 envoy/envoytest