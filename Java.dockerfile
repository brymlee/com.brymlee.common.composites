FROM ubuntu:latest
RUN apt-get update
RUN apt-get install -y tree vim wget curl openjdk-11-jdk-headless maven git
ENV JAVA_HOME=/usr/lib/jvm/java-11-openjdk-amd64
ENV MVN_HOME=/usr/share/maven
ENV PATH=$PATH:$JAVA_HOME/bin:$MVN_HOME/bin
RUN mvn org.apache.maven.plugins:maven-dependency-plugin:2.7:get -DgroupId=org.junit.jupiter -D artifactId=junit-jupiter -D version=5.6.1
RUN mvn org.apache.maven.plugins:maven-dependency-plugin:2.7:get -DgroupId=org.junit.platform -D artifactId=junit-platform-launcher -D version=1.6.2
