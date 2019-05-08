FROM java:8
VOLUME /gjny/jar-docker-testjenkins/tmp
ADD ./target/model-eureka-client2.jar /app.jar
RUN bash -c 'touch /app.jar'
EXPOSE 8112
ENV JAVA_OPTS="-Xmx64m -Xss512K"
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]