FROM azul/zulu-openjdk-alpine:14
RUN apk add --no-cache tzdata
ENV TZ America/Sao_Paulo
COPY target/*.jar /tmp/app.jar
CMD java -XX:+UseContainerSupport -XX:MaxRAMPercentage=90 -jar /tmp/app.jar

