# tracing-with-jaeger-and-quarkus
Quick start example by Jaeger Tracing and Quarkus Framework

## Instructions

Service A runs in http port 8080;
Service B runs in http port 8081;
Service C runs in http port 8082;

Example HTTP GET Request: http://localhost:8080/service-a/info/my name is/Emerson/what about you

## Creating Quarkus services containers

In root folder of service project, execute:
  a. ./mvnw package -Pnative -Dquarkus.native.container-build=true
  b. docker build -f src/main/docker/Dockerfile.native -t emersonluiz91/servicea .
  c. docker run -i --rm -p 8080:8080 emersonluiz91/servicea


## Docker Commands

docker run -d \
    --name postgres \
    -e POSTGRES_PASSWORD=123456 \
    -e PGDATA=/var/lib/postgresql/data/pgdata \
    -v /custom/mount:/var/lib/postgresql/data \
    -p 5432:5432 \
    postgres

docker run -d --name jaeger \
 -p 6831:6831/udp \
 -p 16686:16686 \
 -p 14268:14268 \
 jaegertracing/all-in-one:1.18.0



## References

GraalVM Install Guide
https://www.graalvm.org/docs/getting-started/linux
https://github.com/graalvm/graalvm-ce-builds/releases/tag/vm-20.0.0

Quarkus Hello World
https://code.quarkus.io/

Quarkus Native Image
https://quarkus.io/guides/building-native-image

Quarkus Jaeger Guide
https://quarkus.io/guides/opentracing

Book: Hands-On Cloud-Native Applications with Java and Quarkus, By Francesco Marchioni, December 2019

Book: Mastering Distributed Tracing, By Yuri Shkuro, February 2019



