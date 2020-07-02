FROM 10.3.10.131:5000/gsafety/java:8

MAINTAINER 996492571@qq.com
ADD target/demo-0.0.1-SNAPSHOT.jar /app.jar

EXPOSE 8080
ENTRYPOINT ["java","-Xmx100m","-Dserver.port=8080","-jar","app.jar"]
