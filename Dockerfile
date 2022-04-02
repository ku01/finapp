FROM gradle:7.4.2-jdk17 AS build
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle clean build --no-daemon

FROM bellsoft/liberica-openjdk-alpine:17.0.2-9
EXPOSE 8180
RUN mkdir /app
WORKDIR /app
COPY --from=build /home/gradle/src/fin/build/libs/*.jar /app/app.jar
COPY entry.sh /app/entry.sh
ENTRYPOINT ["/app/entry.sh"]
