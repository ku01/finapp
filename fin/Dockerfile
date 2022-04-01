FROM bellsoft/liberica-openjdk-alpine:17.0.2-9
RUN mkdir /app
WORKDIR /app
COPY build/libs/fin-*.jar /app/app.jar
COPY entry.sh /app/entry.sh
ENTRYPOINT ["/app/entry.sh"]
