# First stage: JDK with GraalVM
FROM ghcr.io/graalvm/jdk-community:25 AS build
#FROM ghcr.io/graalvm/jdk:21 AS build

RUN microdnf update -y && \
microdnf install -y gcc glibc-devel zlib-devel libstdc++-devel gcc-c++ && \
microdnf clean all

WORKDIR /opt/base
COPY target/spring-modulith-course app

# Second stage
FROM debian:bookworm-slim

WORKDIR /opt/modulith

LABEL DEVELOPER='Hotienquoc<hotienquoc0429@test.com>'

EXPOSE 8081

#COPY target/spring-modulith-course app
COPY --from=build /opt/base/app /opt/modulith/app
RUN ls -a /opt

ENTRYPOINT ["./app"]