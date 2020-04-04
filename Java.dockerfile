FROM ubuntu:latest
RUN apt-get update
RUN apt-get install -y tree vim wget curl openjdk-11-jdk-headless maven git
ENV JAVA_HOME=/usr/lib/jvm/java-11-openjdk-amd64
ENV MVN_HOME=/usr/share/maven
ENV PATH=$PATH:$JAVA_HOME/bin:$MVN_HOME/bin
