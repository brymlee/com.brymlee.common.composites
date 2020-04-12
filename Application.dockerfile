FROM com.brymlee.common.composites.development:latest
ENV JUNIT_PLATFORM_LAUNCHER=/root/.m2/repository/org/junit/platform/junit-platform-launcher/1.6.2/junit-platform-launcher-1.6.2.jar
ENV JUNIT_PLATFORM_ENGINE=/root/.m2/repository/org/junit/platform/junit-platform-engine/1.6.2/junit-platform-engine-1.6.2.jar
ENV JUNIT_PLATFORM_COMMONS=/root/.m2/repository/org/junit/platform/junit-platform-commons/1.6.2/junit-platform-commons-1.6.2.jar
ENV JUNIT_JUPITER_API=/root/.m2/repository/org/junit/jupiter/junit-jupiter-api/5.6.1/junit-jupiter-api-5.6.1.jar
ENV JUNIT_JUPITER_ENGINE=/root/.m2/repository/org/junit/jupiter/junit-jupiter-engine/5.6.1/junit-jupiter-engine-5.6.1.jar
ENV OPEN_TEST4J=/root/.m2/repository/org/opentest4j/opentest4j/1.2.0/opentest4j-1.2.0.jar
ENV API_GUARDIANS=/root/.m2/repository/org/apiguardian/apiguardian-api/1.1.0/apiguardian-api-1.1.0.jar
RUN mkdir target -p
WORKDIR /com.brymlee.common.composites
RUN cp $JUNIT_PLATFORM_LAUNCHER target
RUN cp $JUNIT_PLATFORM_ENGINE target
RUN cp $JUNIT_PLATFORM_COMMONS target
RUN cp $JUNIT_JUPITER_API target
RUN cp $JUNIT_JUPITER_ENGINE target
RUN cp $OPEN_TEST4J target
RUN cp $API_GUARDIANS target
ENV MODULE_PATH=target
RUN javac -Xlint:unchecked --module-path "$MODULE_PATH" --module com.brymlee.common.composites --module-source-path src/main/java -d target
RUN jar --create --file target/com.brymlee.common.composites.jar --main-class com.brymlee.common.composites.pub.Application -C target/com.brymlee.common.composites .
RUN rm target/com.brymlee.common.composites -rf
#CMD ["java", "--module-path", "$MODULE_PATH", "--list-modules", "--module", "com.brymlee.common.composites"]
CMD ["java", "--module-path", "target/com.brymlee.common.composites.jar:target", "--module", "com.brymlee.common.composites"]
#error: module not found: org.junit.platform.engine
#error: module not found: org.junit.platform.commons
#error: module not found: org.apiguardian.api
