FROM gradle:7.4.2-jdk17 AS build
WORKDIR /home/gradle/src
RUN mkdir fin
COPY --chown=gradle:gradle build.gradle.kts /home/gradle/src
COPY --chown=gradle:gradle settings.gradle.kts /home/gradle/src
COPY --chown=gradle:gradle fin/build.gradle.kts /home/gradle/src/fin
RUN gradle clean build --no-daemon > /dev/null 2>&1 || true
COPY --chown=gradle:gradle . /home/gradle/src
RUN gradle clean build --no-daemon

FROM bellsoft/liberica-openjdk-alpine:17.0.2-9
EXPOSE 8180
RUN mkdir /app
WORKDIR /app
COPY --from=build /home/gradle/src/fin/build/libs/*.jar /app/app.jar
COPY entry.sh /app/entry.sh
ENTRYPOINT ["/app/entry.sh"]
