FROM registry.access.redhat.com/ubi8/openjdk-11:latest

COPY target/demo-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT [ "java","-jar","app.jar" ]