FROM openjdk

MAINTAINER leewhh@foxmail.com
ADD target/rancher-pipelines-demo-0.0.1-SNAPSHOT.jar /app.jar

EXPOSE 10010
ENTRYPOINT ["java","-Xmx300m","-Dserver.port=10010","-jar","app.jar"]